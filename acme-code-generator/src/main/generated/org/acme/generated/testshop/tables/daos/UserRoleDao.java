/*
 * This file is generated by jOOQ.
 */
package org.acme.generated.testshop.tables.daos;


import jakarta.validation.Valid;

import java.util.List;

import org.acme.generated.testshop.tables.UserRole;
import org.acme.generated.testshop.tables.records.UserRoleRecord;
import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Valid
public class UserRoleDao extends DAOImpl<UserRoleRecord, org.acme.generated.testshop.tables.dtos.UserRole, Record2<Integer, String>> {

    /**
     * Create a new UserRoleDao without any configuration
     */
    public UserRoleDao() {
        super(UserRole.USER_ROLE, org.acme.generated.testshop.tables.dtos.UserRole.class);
    }

    /**
     * Create a new UserRoleDao with an attached configuration
     */
    public UserRoleDao(Configuration configuration) {
        super(UserRole.USER_ROLE, org.acme.generated.testshop.tables.dtos.UserRole.class, configuration);
    }

    @Override
    public Record2<Integer, String> getId(org.acme.generated.testshop.tables.dtos.UserRole object) {
        return compositeKeyRecord(object.getUserId(), object.getRoleId());
    }

    /**
     * Fetch records that have <code>userId BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.testshop.tables.dtos.UserRole> fetchRangeOfUserid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(UserRole.USER_ROLE.USERID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>userId IN (values)</code>
     */
    public List<org.acme.generated.testshop.tables.dtos.UserRole> fetchByUserid(Integer... values) {
        return fetch(UserRole.USER_ROLE.USERID, values);
    }

    /**
     * Fetch records that have <code>roleId BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.acme.generated.testshop.tables.dtos.UserRole> fetchRangeOfRoleid(String lowerInclusive, String upperInclusive) {
        return fetchRange(UserRole.USER_ROLE.ROLEID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>roleId IN (values)</code>
     */
    public List<org.acme.generated.testshop.tables.dtos.UserRole> fetchByRoleid(String... values) {
        return fetch(UserRole.USER_ROLE.ROLEID, values);
    }
}
