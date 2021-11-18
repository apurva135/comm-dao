/*
 * This file is generated by jOOQ.
 */
package com.epam.ta.reportportal.jooq.enums;


import com.epam.ta.reportportal.jooq.JPublic;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum JStatusEnum implements EnumType {

    CANCELLED("CANCELLED"),

    FAILED("FAILED"),

    INTERRUPTED("INTERRUPTED"),

    IN_PROGRESS("IN_PROGRESS"),

    PASSED("PASSED"),

    RESETED("RESETED"),

    SKIPPED("SKIPPED"),

    STOPPED("STOPPED"),

    INFO("INFO"),

    WARN("WARN");

    private final String literal;

    private JStatusEnum(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    @Override
    public String getName() {
        return "status_enum";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
