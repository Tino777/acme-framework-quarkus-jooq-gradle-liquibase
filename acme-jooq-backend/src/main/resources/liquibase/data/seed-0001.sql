-- liquibase formatted sql

-- changeset tino:feature-1321-1
INSERT INTO product (clientId, price)
SELECT
    RAND()*2+1 AS clientId, -- random client ID between 1 and 3
    ROUND(RAND() * 100, 2) AS price    -- random price between 0 and 100 with 2 decimal places
FROM
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS nums
        CROSS JOIN
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS nums2
        CROSS JOIN
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS nums3
        CROSS JOIN
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS nums4
        CROSS JOIN
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS nums5
        CROSS JOIN
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS nums6;

-- Generate product_lang entries for the new products
INSERT INTO product_lang (productId, langId, name, description)
SELECT
    p.productId,
    l.langId,
    CONCAT('Product ', p.productId, ' (', l.code, ')') AS name,
    CONCAT('This is the ', l.description, ' description for product ', p.productId) AS description
FROM
    product p
        CROSS JOIN lang l
WHERE
    NOT EXISTS (
        SELECT 1
        FROM product_lang pl
        WHERE pl.productId = p.productId AND pl.langId = l.langId
    );
