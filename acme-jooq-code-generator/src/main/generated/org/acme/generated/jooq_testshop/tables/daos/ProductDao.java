/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.jooq_testshop.tables.daos;


import jakarta.validation.Valid;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.acme.generated.jooq_testshop.tables.Product;
import org.acme.generated.jooq_testshop.tables.records.ProductRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Valid
public class ProductDao extends DAOImpl<ProductRecord, org.acme.generated.jooq_testshop.tables.dtos.Product, Long> {

    /**
     * Create a new ProductDao without any configuration
     */
    public ProductDao() {
        super(Product.PRODUCT, org.acme.generated.jooq_testshop.tables.dtos.Product.class);
    }

    /**
     * Create a new ProductDao with an attached configuration
     */
    public ProductDao(Configuration configuration) {
        super(Product.PRODUCT, org.acme.generated.jooq_testshop.tables.dtos.Product.class, configuration);
    }

    @Override
    public Long getId(org.acme.generated.jooq_testshop.tables.dtos.Product object) {
        return object.getProductId();
    }

    /**
     * Fetch records that have <code>productId BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchRangeOfProductid(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Product.PRODUCT.PRODUCTID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>productId IN (values)</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchByProductid(Long... values) {
        return fetch(Product.PRODUCT.PRODUCTID, values);
    }

    /**
     * Fetch a unique record that has <code>productId = value</code>
     */
    public org.acme.generated.jooq_testshop.tables.dtos.Product fetchOneByProductid(Long value) {
        return fetchOne(Product.PRODUCT.PRODUCTID, value);
    }

    /**
     * Fetch a unique record that has <code>productId = value</code>
     */
    public Optional<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchOptionalByProductid(Long value) {
        return fetchOptional(Product.PRODUCT.PRODUCTID, value);
    }

    /**
     * Fetch records that have <code>clientId BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchRangeOfClientid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Product.PRODUCT.CLIENTID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>clientId IN (values)</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchByClientid(Integer... values) {
        return fetch(Product.PRODUCT.CLIENTID, values);
    }

    /**
     * Fetch records that have <code>price BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchRangeOfPrice(BigDecimal lowerInclusive, BigDecimal upperInclusive) {
        return fetchRange(Product.PRODUCT.PRICE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>price IN (values)</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchByPrice(BigDecimal... values) {
        return fetch(Product.PRODUCT.PRICE, values);
    }

    /**
     * Fetch records that have <code>createdAt BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchRangeOfCreatedat(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Product.PRODUCT.CREATEDAT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>createdAt IN (values)</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchByCreatedat(LocalDateTime... values) {
        return fetch(Product.PRODUCT.CREATEDAT, values);
    }

    /**
     * Fetch records that have <code>updatedAt BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchRangeOfUpdatedat(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Product.PRODUCT.UPDATEDAT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>updatedAt IN (values)</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchByUpdatedat(LocalDateTime... values) {
        return fetch(Product.PRODUCT.UPDATEDAT, values);
    }

    /**
     * Fetch records that have <code>deleted BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchRangeOfDeleted(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(Product.PRODUCT.DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<org.acme.generated.jooq_testshop.tables.dtos.Product> fetchByDeleted(Boolean... values) {
        return fetch(Product.PRODUCT.DELETED, values);
    }
}