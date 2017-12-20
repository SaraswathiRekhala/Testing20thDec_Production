/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * One2oneUcChild1 generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`One2One_UC_Child1`", uniqueConstraints = {
        @UniqueConstraint(name = "`UK_One2One_UC_Child1_EmaCHKI0`", columnNames = {"`Email Col`"})})
public class One2oneUcChild1 implements Serializable {

    private Short shortId;
    private String emailCol;
    private String booleanCol;
    private One2oneUcChild one2oneUcChild;

    @Id
    @Column(name = "`Short ID`", nullable = false, scale = 0, precision = 5)
    public Short getShortId() {
        return this.shortId;
    }

    public void setShortId(Short shortId) {
        this.shortId = shortId;
    }

    @Column(name = "`Email Col`", nullable = true, length = 20)
    public String getEmailCol() {
        return this.emailCol;
    }

    public void setEmailCol(String emailCol) {
        this.emailCol = emailCol;
    }

    @Column(name = "`Boolean Col`", nullable = true, length = 1)
    public String getBooleanCol() {
        return this.booleanCol;
    }

    public void setBooleanCol(String booleanCol) {
        this.booleanCol = booleanCol;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`Email Col`", referencedColumnName = "`Email ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_One2One_UC_Child_TO_OgBwwU`"))
    public One2oneUcChild getOne2oneUcChild() {
        return this.one2oneUcChild;
    }

    public void setOne2oneUcChild(One2oneUcChild one2oneUcChild) {
        if(one2oneUcChild != null) {
            this.emailCol = one2oneUcChild.getEmailId();
        }

        this.one2oneUcChild = one2oneUcChild;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof One2oneUcChild1)) return false;
        final One2oneUcChild1 one2oneUcChild1 = (One2oneUcChild1) o;
        return Objects.equals(getShortId(), one2oneUcChild1.getShortId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShortId());
    }
}

