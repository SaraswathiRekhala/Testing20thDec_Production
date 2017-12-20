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

import org.joda.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wavemaker.commons.json.serializer.ByteArrayToStringSerializer;
import com.wavemaker.commons.json.views.JsonViews.BlobAsUrlView;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class SvAllTypesDataResponse implements Serializable {


    @ColumnAlias("INT ID")
    private Integer intId;

    @ColumnAlias("BYTE COL")
    private Byte byteCol;

    @ColumnAlias("SHORT COL")
    private Short shortCol;

    @ColumnAlias("INT COL")
    private Integer intCol;

    @ColumnAlias("FLOAT COL")
    private Double floatCol;

    @ColumnAlias("DOUBLE COL")
    private BigDecimal doubleCol;

    @ColumnAlias("BIGINT COL")
    private BigInteger bigintCol;

    @ColumnAlias("BIGDEC COL")
    private BigDecimal bigdecCol;

    @ColumnAlias("CHAR COL")
    private String charCol;

    @ColumnAlias("STRING COL")
    private String stringCol;

    @ColumnAlias("BOOLEAN COL")
    private String booleanCol;

    @ColumnAlias("BOOLEAN_COL_Y_N")
    private String booleanColYN;

    @ColumnAlias("DATETIME COL")
    private LocalDateTime datetimeCol;

    @ColumnAlias("TIMESTAMP COL")
    private Timestamp timestampCol;

        @JsonView(BlobAsUrlView.class)
    @JsonSerialize(using = ByteArrayToStringSerializer.class)
    @JsonProperty(access = Access.READ_ONLY)
    @ColumnAlias("BLOB COL")
    private byte[] blobCol;

    @ColumnAlias("TEXT COL")
    private String textCol;

    @ColumnAlias("CLOB COL")
    private String clobCol;

    public Integer getIntId() {
        return this.intId;
    }

    public void setIntId(Integer intId) {
        this.intId = intId;
    }

    public Byte getByteCol() {
        return this.byteCol;
    }

    public void setByteCol(Byte byteCol) {
        this.byteCol = byteCol;
    }

    public Short getShortCol() {
        return this.shortCol;
    }

    public void setShortCol(Short shortCol) {
        this.shortCol = shortCol;
    }

    public Integer getIntCol() {
        return this.intCol;
    }

    public void setIntCol(Integer intCol) {
        this.intCol = intCol;
    }

    public Double getFloatCol() {
        return this.floatCol;
    }

    public void setFloatCol(Double floatCol) {
        this.floatCol = floatCol;
    }

    public BigDecimal getDoubleCol() {
        return this.doubleCol;
    }

    public void setDoubleCol(BigDecimal doubleCol) {
        this.doubleCol = doubleCol;
    }

    public BigInteger getBigintCol() {
        return this.bigintCol;
    }

    public void setBigintCol(BigInteger bigintCol) {
        this.bigintCol = bigintCol;
    }

    public BigDecimal getBigdecCol() {
        return this.bigdecCol;
    }

    public void setBigdecCol(BigDecimal bigdecCol) {
        this.bigdecCol = bigdecCol;
    }

    public String getCharCol() {
        return this.charCol;
    }

    public void setCharCol(String charCol) {
        this.charCol = charCol;
    }

    public String getStringCol() {
        return this.stringCol;
    }

    public void setStringCol(String stringCol) {
        this.stringCol = stringCol;
    }

    public String getBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(String booleanCol) {
        this.booleanCol = booleanCol;
    }

    public String getBooleanColYN() {
        return this.booleanColYN;
    }

    public void setBooleanColYN(String booleanColYN) {
        this.booleanColYN = booleanColYN;
    }

    public LocalDateTime getDatetimeCol() {
        return this.datetimeCol;
    }

    public void setDatetimeCol(LocalDateTime datetimeCol) {
        this.datetimeCol = datetimeCol;
    }

    public Timestamp getTimestampCol() {
        return this.timestampCol;
    }

    public void setTimestampCol(Timestamp timestampCol) {
        this.timestampCol = timestampCol;
    }

    public byte[] getBlobCol() {
        return this.blobCol;
    }

    public void setBlobCol(byte[] blobCol) {
        this.blobCol = blobCol;
    }

    public String getTextCol() {
        return this.textCol;
    }

    public void setTextCol(String textCol) {
        this.textCol = textCol;
    }

    public String getClobCol() {
        return this.clobCol;
    }

    public void setClobCol(String clobCol) {
        this.clobCol = clobCol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SvAllTypesDataResponse)) return false;
        final SvAllTypesDataResponse svAllTypesDataResponse = (SvAllTypesDataResponse) o;
        return Objects.equals(getIntId(), svAllTypesDataResponse.getIntId()) &&
                Objects.equals(getByteCol(), svAllTypesDataResponse.getByteCol()) &&
                Objects.equals(getShortCol(), svAllTypesDataResponse.getShortCol()) &&
                Objects.equals(getIntCol(), svAllTypesDataResponse.getIntCol()) &&
                Objects.equals(getFloatCol(), svAllTypesDataResponse.getFloatCol()) &&
                Objects.equals(getDoubleCol(), svAllTypesDataResponse.getDoubleCol()) &&
                Objects.equals(getBigintCol(), svAllTypesDataResponse.getBigintCol()) &&
                Objects.equals(getBigdecCol(), svAllTypesDataResponse.getBigdecCol()) &&
                Objects.equals(getCharCol(), svAllTypesDataResponse.getCharCol()) &&
                Objects.equals(getStringCol(), svAllTypesDataResponse.getStringCol()) &&
                Objects.equals(getBooleanCol(), svAllTypesDataResponse.getBooleanCol()) &&
                Objects.equals(getBooleanColYN(), svAllTypesDataResponse.getBooleanColYN()) &&
                Objects.equals(getDatetimeCol(), svAllTypesDataResponse.getDatetimeCol()) &&
                Objects.equals(getTimestampCol(), svAllTypesDataResponse.getTimestampCol()) &&
                Objects.equals(getBlobCol(), svAllTypesDataResponse.getBlobCol()) &&
                Objects.equals(getTextCol(), svAllTypesDataResponse.getTextCol()) &&
                Objects.equals(getClobCol(), svAllTypesDataResponse.getClobCol());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIntId(),
                getByteCol(),
                getShortCol(),
                getIntCol(),
                getFloatCol(),
                getDoubleCol(),
                getBigintCol(),
                getBigdecCol(),
                getCharCol(),
                getStringCol(),
                getBooleanCol(),
                getBooleanColYN(),
                getDatetimeCol(),
                getTimestampCol(),
                getBlobCol(),
                getTextCol(),
                getClobCol());
    }
}