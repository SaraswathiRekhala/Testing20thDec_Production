/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BooleanTable generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`BOOLEAN_TABLE`")
public class BooleanTable implements Serializable {

    private Integer seqId;
    private String booleanYN;
    private String booleanCol;
    private String column4;

    @Id
    @Column(name = "`SEQ ID`", nullable = false, scale = 0, precision = 10)
    public Integer getSeqId() {
        return this.seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    @Column(name = "`BOOLEAN_Y_N`", nullable = true, length = 1)
    public String getBooleanYN() {
        return this.booleanYN;
    }

    public void setBooleanYN(String booleanYN) {
        this.booleanYN = booleanYN;
    }

    @Column(name = "`BOOLEAN_COL`", nullable = true, length = 1)
    public String getBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(String booleanCol) {
        this.booleanCol = booleanCol;
    }

    @Column(name = "`COLUMN4`", nullable = false, length = 255)
    public String getColumn4() {
        return this.column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BooleanTable)) return false;
        final BooleanTable booleanTable = (BooleanTable) o;
        return Objects.equals(getSeqId(), booleanTable.getSeqId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSeqId());
    }
}

