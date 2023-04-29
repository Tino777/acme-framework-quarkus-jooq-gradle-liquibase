/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.jooq_testshop;


import jakarta.validation.Valid;

import java.util.Arrays;
import java.util.List;

import org.acme.generated.DefaultCatalog;
import org.acme.generated.jooq_testshop.tables.Client;
import org.acme.generated.jooq_testshop.tables.Databasechangelog;
import org.acme.generated.jooq_testshop.tables.Databasechangeloglock;
import org.acme.generated.jooq_testshop.tables.Lang;
import org.acme.generated.jooq_testshop.tables.Product;
import org.acme.generated.jooq_testshop.tables.ProductLang;
import org.acme.generated.jooq_testshop.tables.Role;
import org.acme.generated.jooq_testshop.tables.User;
import org.acme.generated.jooq_testshop.tables.UserRole;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Valid
public class JooqTestshop extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>jooq_testshop</code>
     */
    public static final JooqTestshop JOOQ_TESTSHOP = new JooqTestshop();

    /**
     * The table <code>jooq_testshop.client</code>.
     */
    public final Client CLIENT = Client.CLIENT;

    /**
     * The table <code>jooq_testshop.DATABASECHANGELOG</code>.
     */
    public final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>jooq_testshop.DATABASECHANGELOGLOCK</code>.
     */
    public final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * The table <code>jooq_testshop.lang</code>.
     */
    public final Lang LANG = Lang.LANG;

    /**
     * The table <code>jooq_testshop.product</code>.
     */
    public final Product PRODUCT = Product.PRODUCT;

    /**
     * The table <code>jooq_testshop.product_lang</code>.
     */
    public final ProductLang PRODUCT_LANG = ProductLang.PRODUCT_LANG;

    /**
     * The table <code>jooq_testshop.role</code>.
     */
    public final Role ROLE = Role.ROLE;

    /**
     * The table <code>jooq_testshop.user</code>.
     */
    public final User USER = User.USER;

    /**
     * The table <code>jooq_testshop.user_role</code>.
     */
    public final UserRole USER_ROLE = UserRole.USER_ROLE;

    /**
     * No further instances allowed
     */
    private JooqTestshop() {
        super("jooq_testshop", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Client.CLIENT,
            Databasechangelog.DATABASECHANGELOG,
            Databasechangeloglock.DATABASECHANGELOGLOCK,
            Lang.LANG,
            Product.PRODUCT,
            ProductLang.PRODUCT_LANG,
            Role.ROLE,
            User.USER,
            UserRole.USER_ROLE
        );
    }
}