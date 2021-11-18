/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JUsersRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JUsers extends TableImpl<JUsersRecord> {

    private static final long serialVersionUID = 2058736098;

    /**
     * The reference instance of <code>public.users</code>
     */
    public static final JUsers USERS = new JUsers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JUsersRecord> getRecordType() {
        return JUsersRecord.class;
    }

    /**
     * The column <code>public.users.id</code>.
     */
    public final TableField<JUsersRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('users_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.users.login</code>.
     */
    public final TableField<JUsersRecord, String> LOGIN = createField(DSL.name("login"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.users.password</code>.
     */
    public final TableField<JUsersRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.users.email</code>.
     */
    public final TableField<JUsersRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.users.attachment</code>.
     */
    public final TableField<JUsersRecord, String> ATTACHMENT = createField(DSL.name("attachment"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.users.attachment_thumbnail</code>.
     */
    public final TableField<JUsersRecord, String> ATTACHMENT_THUMBNAIL = createField(DSL.name("attachment_thumbnail"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.users.role</code>.
     */
    public final TableField<JUsersRecord, String> ROLE = createField(DSL.name("role"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.users.type</code>.
     */
    public final TableField<JUsersRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.users.expired</code>.
     */
    public final TableField<JUsersRecord, Boolean> EXPIRED = createField(DSL.name("expired"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.users.full_name</code>.
     */
    public final TableField<JUsersRecord, String> FULL_NAME = createField(DSL.name("full_name"), org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.users.metadata</code>.
     */
    public final TableField<JUsersRecord, JSONB> METADATA = createField(DSL.name("metadata"), org.jooq.impl.SQLDataType.JSONB, this, "");

    /**
     * Create a <code>public.users</code> table reference
     */
    public JUsers() {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public JUsers(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>public.users</code> table reference
     */
    public JUsers(Name alias) {
        this(alias, USERS);
    }

    private JUsers(Name alias, Table<JUsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private JUsers(Name alias, Table<JUsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JUsers(Table<O> child, ForeignKey<O, JUsersRecord> key) {
        super(child, key, USERS);
    }

    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USERS_EMAIL_KEY, Indexes.USERS_LOGIN_KEY, Indexes.USERS_PK);
    }

    @Override
    public Identity<JUsersRecord, Long> getIdentity() {
        return Keys.IDENTITY_USERS;
    }

    @Override
    public UniqueKey<JUsersRecord> getPrimaryKey() {
        return Keys.USERS_PK;
    }

    @Override
    public List<UniqueKey<JUsersRecord>> getKeys() {
        return Arrays.<UniqueKey<JUsersRecord>>asList(Keys.USERS_PK, Keys.USERS_LOGIN_KEY, Keys.USERS_EMAIL_KEY);
    }

    @Override
    public JUsers as(String alias) {
        return new JUsers(DSL.name(alias), this);
    }

    @Override
    public JUsers as(Name alias) {
        return new JUsers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JUsers rename(String name) {
        return new JUsers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JUsers rename(Name name) {
        return new JUsers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, String, String, String, String, String, Boolean, String, JSONB> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}