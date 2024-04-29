-- liquibase formatted sql

-- changeset tino:feature-1122-1
CREATE TABLE role
(
    roleId VARCHAR(50) NOT NULL,
    PRIMARY KEY (roleId)
);

CREATE TABLE client
(
    clientId INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (clientId)
);

CREATE TABLE user
(
    userId     INT NOT NULL AUTO_INCREMENT,
    clientId   INT NOT NULL,
    email      VARCHAR(255) NOT NULL,
    firstname  VARCHAR(255) NOT NULL,
    lastname   VARCHAR(255) NOT NULL,
    PRIMARY KEY (userId),
    CONSTRAINT fk_user_clientId FOREIGN KEY (clientId) REFERENCES client (clientId) ON DELETE CASCADE
);

CREATE TABLE user_role
(
    userId     INT NOT NULL,
    roleId     VARCHAR(50) NOT NULL,
    PRIMARY KEY (userId, roleId),
    CONSTRAINT fk_user_role_userId FOREIGN KEY (userId) REFERENCES user (userId) ON DELETE CASCADE,
    CONSTRAINT fk_user_role_roleId FOREIGN KEY (roleId) REFERENCES role (roleId) ON DELETE CASCADE
);
--rollback drop table role;
--rollback drop table client;
--rollback drop table user;
--rollback drop table user_role;

-- changeset tino:feature-1234-1
CREATE TABLE lang
(
    langId      INT     NOT NULL AUTO_INCREMENT,
    code        CHAR(2) NOT NULL,
    description VARCHAR(50),
    PRIMARY KEY (langId)
);

CREATE TABLE product
(
    productId BIGINT(20) NOT NULL AUTO_INCREMENT,
    clientId  INT            NOT NULL,
    price     DECIMAL(10, 2) NOT NULL,
    createdAt DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedAt DATETIME       NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    deleted   tinyint(1) NOT NULL DEFAULT 0,
    PRIMARY KEY (productId),
    CONSTRAINT fk_product_clientId FOREIGN KEY (clientId) REFERENCES client (clientId) ON DELETE CASCADE
);

CREATE TABLE product_lang
(
    productId   BIGINT(20) NOT NULL,
    langId      INT          NOT NULL,
    name        VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    PRIMARY KEY (productId, langId),
    CONSTRAINT fk_product_lang_productId FOREIGN KEY (productId) REFERENCES product (productId) ON DELETE CASCADE,
    CONSTRAINT fk_product_lang_langId FOREIGN KEY (langId) REFERENCES lang (langId) ON DELETE CASCADE
);
--rollback drop table lang;
--rollback drop table product;
--rollback drop table product_lang;
