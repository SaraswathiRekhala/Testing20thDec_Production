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
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Many2oneCompChild generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`MANY2ONE_COMP_CHILD`")
@IdClass(Many2oneCompChildId.class)
public class Many2oneCompChild implements Serializable {

    private BigDecimal doubleId;
    private Byte byteId;
    private String charId;
    private String stringId;
    private Double floatId;
    private String booleanCol;
    private Many2oneCompParent many2oneCompParent;
    private Many2oneCompChild2 many2oneCompChild2;

    @Id
    @Column(name = "`DOUBLE ID`", nullable = false, scale = 8, precision = 18)
    public BigDecimal getDoubleId() {
        return this.doubleId;
    }

    public void setDoubleId(BigDecimal doubleId) {
        this.doubleId = doubleId;
    }

    @Id
    @Column(name = "`BYTE ID`", nullable = false, scale = 0, precision = 2)
    public Byte getByteId() {
        return this.byteId;
    }

    public void setByteId(Byte byteId) {
        this.byteId = byteId;
    }

    @Id
    @Column(name = "`CHAR ID`", nullable = false, length = 1)
    public String getCharId() {
        return this.charId;
    }

    public void setCharId(String charId) {
        this.charId = charId;
    }

    @Column(name = "`STRING ID`", nullable = true, length = 20)
    public String getStringId() {
        return this.stringId;
    }

    public void setStringId(String stringId) {
        this.stringId = stringId;
    }

    @Column(name = "`FLOAT ID`", nullable = true, scale = 4, precision = 8)
    public Double getFloatId() {
        return this.floatId;
    }

    public void setFloatId(Double floatId) {
        this.floatId = floatId;
    }

    @Column(name = "`BOOLEAN COL`", nullable = true, length = 1)
    public String getBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(String booleanCol) {
        this.booleanCol = booleanCol;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns(value = {
            @JoinColumn(name = "`BYTE ID`", referencedColumnName = "`BYTE ID`", insertable = false, updatable = false),
            @JoinColumn(name = "`STRING ID`", referencedColumnName = "`STRING ID`", insertable = false, updatable = false),
            @JoinColumn(name = "`CHAR ID`", referencedColumnName = "`CHAR ID`", insertable = false, updatable = false),
            @JoinColumn(name = "`FLOAT ID`", referencedColumnName = "`FLOAT ID`", insertable = false, updatable = false)},
        foreignKey = @ForeignKey(name = "`FK_MANY2ONE_COMP_CHILD_TIP4f5`"))
    public Many2oneCompParent getMany2oneCompParent() {
        return this.many2oneCompParent;
    }

    public void setMany2oneCompParent(Many2oneCompParent many2oneCompParent) {
        if(many2oneCompParent != null) {
            this.byteId = many2oneCompParent.getByteId();
            this.stringId = many2oneCompParent.getStringId();
            this.charId = many2oneCompParent.getCharId();
            this.floatId = many2oneCompParent.getFloatId();
        }

        this.many2oneCompParent = many2oneCompParent;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "many2oneCompChild")
    public Many2oneCompChild2 getMany2oneCompChild2() {
        return this.many2oneCompChild2;
    }

    public void setMany2oneCompChild2(Many2oneCompChild2 many2oneCompChild2) {
        this.many2oneCompChild2 = many2oneCompChild2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Many2oneCompChild)) return false;
        final Many2oneCompChild many2oneCompChild = (Many2oneCompChild) o;
        return Objects.equals(getDoubleId(), many2oneCompChild.getDoubleId()) &&
                Objects.equals(getByteId(), many2oneCompChild.getByteId()) &&
                Objects.equals(getCharId(), many2oneCompChild.getCharId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDoubleId(),
                getByteId(),
                getCharId());
    }
}
