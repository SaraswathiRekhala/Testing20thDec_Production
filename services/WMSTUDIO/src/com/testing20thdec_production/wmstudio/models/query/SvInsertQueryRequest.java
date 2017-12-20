/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class SvInsertQueryRequest implements Serializable {


    @JsonProperty("PK_COLUMN")
    @NotNull
    private Integer pkColumn;

    @JsonProperty("BYTE_COLUMN")
    @NotNull
    private Byte byteColumn;

    @JsonProperty("SHORT_COLUMN")
    @NotNull
    private Short shortColumn;

    @JsonProperty("INT_COLUMN")
    @NotNull
    private Integer intColumn;

    @JsonProperty("FLOAT_COLUMN")
    @NotNull
    private Float floatColumn;

    @JsonProperty("DOUBLE_COLUMN")
    @NotNull
    private Double doubleColumn;

    @JsonProperty("BIGINT_COLUMN")
    @NotNull
    private BigInteger bigintColumn;

    @JsonProperty("BIGDEC_COLUMN")
    @NotNull
    private BigDecimal bigdecColumn;

    @JsonProperty("CHAR_COLUMN")
    @NotNull
    private Character charColumn;

    @JsonProperty("STRING_COLUMN")
    @NotNull
    private String stringColumn;

    @JsonProperty("BOOLEAN_COLUMN")
    @NotNull
    private Boolean booleanColumn;

    @JsonProperty("BOOLEAN_Y_N_COLUMN")
    @NotNull
    private Character booleanYNColumn;

    @JsonProperty("DATETIME_COLUMN")
    @NotNull
    private LocalDateTime datetimeColumn;

    @JsonProperty("TIMESTAMP_COLUMN")
    @NotNull
    private Timestamp timestampColumn;

    @JsonProperty(value = "BLOB_COLUMN", access = Access.READ_ONLY)
    private byte[] blobColumn;

    @JsonProperty("TEXT_COLUMN")
    @NotNull
    private String textColumn;

    @JsonProperty("CLOB_COLUMN")
    @NotNull
    private String clobColumn;

    public Integer getPkColumn() {
        return this.pkColumn;
    }

    public void setPkColumn(Integer pkColumn) {
        this.pkColumn = pkColumn;
    }

    public Byte getByteColumn() {
        return this.byteColumn;
    }

    public void setByteColumn(Byte byteColumn) {
        this.byteColumn = byteColumn;
    }

    public Short getShortColumn() {
        return this.shortColumn;
    }

    public void setShortColumn(Short shortColumn) {
        this.shortColumn = shortColumn;
    }

    public Integer getIntColumn() {
        return this.intColumn;
    }

    public void setIntColumn(Integer intColumn) {
        this.intColumn = intColumn;
    }

    public Float getFloatColumn() {
        return this.floatColumn;
    }

    public void setFloatColumn(Float floatColumn) {
        this.floatColumn = floatColumn;
    }

    public Double getDoubleColumn() {
        return this.doubleColumn;
    }

    public void setDoubleColumn(Double doubleColumn) {
        this.doubleColumn = doubleColumn;
    }

    public BigInteger getBigintColumn() {
        return this.bigintColumn;
    }

    public void setBigintColumn(BigInteger bigintColumn) {
        this.bigintColumn = bigintColumn;
    }

    public BigDecimal getBigdecColumn() {
        return this.bigdecColumn;
    }

    public void setBigdecColumn(BigDecimal bigdecColumn) {
        this.bigdecColumn = bigdecColumn;
    }

    public Character getCharColumn() {
        return this.charColumn;
    }

    public void setCharColumn(Character charColumn) {
        this.charColumn = charColumn;
    }

    public String getStringColumn() {
        return this.stringColumn;
    }

    public void setStringColumn(String stringColumn) {
        this.stringColumn = stringColumn;
    }

    public Boolean getBooleanColumn() {
        return this.booleanColumn;
    }

    public void setBooleanColumn(Boolean booleanColumn) {
        this.booleanColumn = booleanColumn;
    }

    public Character getBooleanYNColumn() {
        return this.booleanYNColumn;
    }

    public void setBooleanYNColumn(Character booleanYNColumn) {
        this.booleanYNColumn = booleanYNColumn;
    }

    public LocalDateTime getDatetimeColumn() {
        return this.datetimeColumn;
    }

    public void setDatetimeColumn(LocalDateTime datetimeColumn) {
        this.datetimeColumn = datetimeColumn;
    }

    public Timestamp getTimestampColumn() {
        return this.timestampColumn;
    }

    public void setTimestampColumn(Timestamp timestampColumn) {
        this.timestampColumn = timestampColumn;
    }

    public byte[] getBlobColumn() {
        return this.blobColumn;
    }

    public void setBlobColumn(byte[] blobColumn) {
        this.blobColumn = blobColumn;
    }

    public String getTextColumn() {
        return this.textColumn;
    }

    public void setTextColumn(String textColumn) {
        this.textColumn = textColumn;
    }

    public String getClobColumn() {
        return this.clobColumn;
    }

    public void setClobColumn(String clobColumn) {
        this.clobColumn = clobColumn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SvInsertQueryRequest)) return false;
        final SvInsertQueryRequest svInsertQueryRequest = (SvInsertQueryRequest) o;
        return Objects.equals(getPkColumn(), svInsertQueryRequest.getPkColumn()) &&
                Objects.equals(getByteColumn(), svInsertQueryRequest.getByteColumn()) &&
                Objects.equals(getShortColumn(), svInsertQueryRequest.getShortColumn()) &&
                Objects.equals(getIntColumn(), svInsertQueryRequest.getIntColumn()) &&
                Objects.equals(getFloatColumn(), svInsertQueryRequest.getFloatColumn()) &&
                Objects.equals(getDoubleColumn(), svInsertQueryRequest.getDoubleColumn()) &&
                Objects.equals(getBigintColumn(), svInsertQueryRequest.getBigintColumn()) &&
                Objects.equals(getBigdecColumn(), svInsertQueryRequest.getBigdecColumn()) &&
                Objects.equals(getCharColumn(), svInsertQueryRequest.getCharColumn()) &&
                Objects.equals(getStringColumn(), svInsertQueryRequest.getStringColumn()) &&
                Objects.equals(getBooleanColumn(), svInsertQueryRequest.getBooleanColumn()) &&
                Objects.equals(getBooleanYNColumn(), svInsertQueryRequest.getBooleanYNColumn()) &&
                Objects.equals(getDatetimeColumn(), svInsertQueryRequest.getDatetimeColumn()) &&
                Objects.equals(getTimestampColumn(), svInsertQueryRequest.getTimestampColumn()) &&
                Objects.equals(getBlobColumn(), svInsertQueryRequest.getBlobColumn()) &&
                Objects.equals(getTextColumn(), svInsertQueryRequest.getTextColumn()) &&
                Objects.equals(getClobColumn(), svInsertQueryRequest.getClobColumn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPkColumn(),
                getByteColumn(),
                getShortColumn(),
                getIntColumn(),
                getFloatColumn(),
                getDoubleColumn(),
                getBigintColumn(),
                getBigdecColumn(),
                getCharColumn(),
                getStringColumn(),
                getBooleanColumn(),
                getBooleanYNColumn(),
                getDatetimeColumn(),
                getTimestampColumn(),
                getBlobColumn(),
                getTextColumn(),
                getClobColumn());
    }
}
