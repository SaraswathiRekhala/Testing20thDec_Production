/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * One2oneChild generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`One2One_Child`")
public class One2oneChild implements Serializable {

    private Byte bytePk;
    private Double floatCol;
    private BigDecimal doubleCol;
    private String textCol;
    private One2oneParent one2oneParent;
    private One2oneUcChild one2oneUcChild;

    @Id
    @GenericGenerator(name = "generator", strategy = "foreign", 
            parameters = @Parameter(name = "property", value = "one2oneParent"))
    @GeneratedValue(generator = "generator")
    @Column(name = "`Byte PK`", nullable = false, insertable = false, updatable = false, scale = 0, precision = 2)
    public Byte getBytePk() {
        return this.bytePk;
    }

    public void setBytePk(Byte bytePk) {
        this.bytePk = bytePk;
    }

    @Column(name = "`Float Col`", nullable = true, scale = 4, precision = 8)
    public Double getFloatCol() {
        return this.floatCol;
    }

    public void setFloatCol(Double floatCol) {
        this.floatCol = floatCol;
    }

    @Column(name = "`Double Col`", nullable = true, scale = 8, precision = 18)
    public BigDecimal getDoubleCol() {
        return this.doubleCol;
    }

    public void setDoubleCol(BigDecimal doubleCol) {
        this.doubleCol = doubleCol;
    }

    @Column(name = "`Text Col`", nullable = true, length = 4000)
    public String getTextCol() {
        return this.textCol;
    }

    public void setTextCol(String textCol) {
        this.textCol = textCol;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    public One2oneParent getOne2oneParent() {
        return this.one2oneParent;
    }

    public void setOne2oneParent(One2oneParent one2oneParent) {
        if(one2oneParent != null) {
            this.bytePk = one2oneParent.getByteId();
        }

        this.one2oneParent = one2oneParent;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "one2oneChild")
    public One2oneUcChild getOne2oneUcChild() {
        return this.one2oneUcChild;
    }

    public void setOne2oneUcChild(One2oneUcChild one2oneUcChild) {
        this.one2oneUcChild = one2oneUcChild;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof One2oneChild)) return false;
        final One2oneChild one2oneChild = (One2oneChild) o;
        return Objects.equals(getBytePk(), one2oneChild.getBytePk());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBytePk());
    }
}

