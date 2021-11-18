/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JPatternTemplateRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class JPatternTemplate extends TableImpl<JPatternTemplateRecord> {

    private static final long serialVersionUID = 505397920;

    /**
     * The reference instance of <code>public.pattern_template</code>
     */
    public static final JPatternTemplate PATTERN_TEMPLATE = new JPatternTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JPatternTemplateRecord> getRecordType() {
        return JPatternTemplateRecord.class;
    }

    /**
     * The column <code>public.pattern_template.id</code>.
     */
    public final TableField<JPatternTemplateRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('pattern_template_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.pattern_template.name</code>.
     */
    public final TableField<JPatternTemplateRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.pattern_template.value</code>.
     */
    public final TableField<JPatternTemplateRecord, String> VALUE = createField(DSL.name("value"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.pattern_template.type</code>.
     */
    public final TableField<JPatternTemplateRecord, String> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.pattern_template.enabled</code>.
     */
    public final TableField<JPatternTemplateRecord, Boolean> ENABLED = createField(DSL.name("enabled"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.pattern_template.project_id</code>.
     */
    public final TableField<JPatternTemplateRecord, Long> PROJECT_ID = createField(DSL.name("project_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.pattern_template</code> table reference
     */
    public JPatternTemplate() {
        this(DSL.name("pattern_template"), null);
    }

    /**
     * Create an aliased <code>public.pattern_template</code> table reference
     */
    public JPatternTemplate(String alias) {
        this(DSL.name(alias), PATTERN_TEMPLATE);
    }

    /**
     * Create an aliased <code>public.pattern_template</code> table reference
     */
    public JPatternTemplate(Name alias) {
        this(alias, PATTERN_TEMPLATE);
    }

    private JPatternTemplate(Name alias, Table<JPatternTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private JPatternTemplate(Name alias, Table<JPatternTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JPatternTemplate(Table<O> child, ForeignKey<O, JPatternTemplateRecord> key) {
        super(child, key, PATTERN_TEMPLATE);
    }

    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PATTERN_TEMPLATE_PK, Indexes.UNQ_NAME_PROJECTID);
    }

    @Override
    public Identity<JPatternTemplateRecord, Long> getIdentity() {
        return Keys.IDENTITY_PATTERN_TEMPLATE;
    }

    @Override
    public UniqueKey<JPatternTemplateRecord> getPrimaryKey() {
        return Keys.PATTERN_TEMPLATE_PK;
    }

    @Override
    public List<UniqueKey<JPatternTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<JPatternTemplateRecord>>asList(Keys.PATTERN_TEMPLATE_PK, Keys.UNQ_NAME_PROJECTID);
    }

    @Override
    public List<ForeignKey<JPatternTemplateRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JPatternTemplateRecord, ?>>asList(Keys.PATTERN_TEMPLATE__PATTERN_TEMPLATE_PROJECT_ID_FKEY);
    }

    public JProject project() {
        return new JProject(this, Keys.PATTERN_TEMPLATE__PATTERN_TEMPLATE_PROJECT_ID_FKEY);
    }

    @Override
    public JPatternTemplate as(String alias) {
        return new JPatternTemplate(DSL.name(alias), this);
    }

    @Override
    public JPatternTemplate as(Name alias) {
        return new JPatternTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JPatternTemplate rename(String name) {
        return new JPatternTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JPatternTemplate rename(Name name) {
        return new JPatternTemplate(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, Boolean, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}