package org.acme.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.oidc.IdToken;
import io.quarkus.oidc.RefreshToken;
import io.quarkus.security.Authenticated;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response;
import org.acme.services.CognitoLocalService;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeType;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;
import org.eclipse.microprofile.openapi.annotations.security.SecuritySchemes;
import org.jboss.logging.Logger;
import software.amazon.awssdk.services.cognitoidentityprovider.CognitoIdentityProviderClient;
import software.amazon.awssdk.services.cognitoidentityprovider.model.*;
import software.amazon.awssdk.services.cognitoidentityprovider.model.NotAuthorizedException;

import java.util.Map;
import java.util.Set;


@SecuritySchemes(value = {
        @SecurityScheme(securitySchemeName = "access_token",
                type = SecuritySchemeType.HTTP,
                scheme = "Bearer")}
)
@Path("/api/v1/cognitoLocal")
public class CognitoLocalResourceV1 {

    private static final Logger LOGGER = Logger.getLogger(CognitoLocalResourceV1.class);

    @Inject
    CognitoLocalService cognitoLocalService;

    /**
     * Injection point for the ID Token issued by the OpenID Connect Provider
     */
    @Inject
    @IdToken
    JsonWebToken idToken;

    /**
     * Injection point for the Access Token issued by the OpenID Connect Provider
     */
    @Inject
    JsonWebToken accessToken;

    /**
     * Injection point for the Refresh Token issued by the OpenID Connect Provider
     */
    @Inject
    RefreshToken refreshToken;

    @POST
    @Path("/signup")
    @Produces(MediaType.TEXT_PLAIN)
    public String signup(@FormParam("email") String email,
                         @FormParam("password") String password) {
        String userSub = cognitoLocalService.signup(email, password);
        return "User created successfully: " + userSub;
    }

    @POST
    @Path("/signin")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public Response signin(@FormParam("email") String email,
                           @FormParam("password") String password) {
        try {
            Map<String, String> jwtTokens = cognitoLocalService.signin(email, password);
            return Response.ok(jwtTokens.get("access_token")).cookie(
                    NewCookie.valueOf("access_token=" + jwtTokens.get("access_token")),
                    NewCookie.valueOf("refresh_token=" + jwtTokens.get("refresh_token")),
                    NewCookie.valueOf("id_token=" + jwtTokens.get("id_token"))
            ).build();
        } catch (NotAuthorizedException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }

    @POST
    @Path("/find")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> find(@FormParam("email") String email) throws UserNotFoundException {
        Map<String, String> attributes = cognitoLocalService.find(email);
        return attributes;
    }


    @GET
    @Path("/protected-by-quarkus")
    @SecurityRequirement(name = "access_token")
    @Authenticated
    @Produces(MediaType.TEXT_PLAIN)
    public String protectedResource() {
        // TODO do i need id-token for authorization
        // TODO can i use id-token for authorization? access_token does not contain custom claims / any claims.

        String name = accessToken.getName();
        String issuer = accessToken.getIssuer();
        String rawToken = accessToken.getRawToken();

        Set<String> claimnames = accessToken.getClaimNames();
        for (String claimname : claimnames) {
            String claimValue = accessToken.getClaim(claimname).toString();
            LOGGER.info(claimname + ": " + claimValue);
        }
        LOGGER.info("name: " + name);
        LOGGER.info("issuer: " + issuer);
        LOGGER.info("rawToken: " + rawToken);
        return "This is a protected resource";
    }

}