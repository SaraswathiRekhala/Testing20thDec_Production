/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.schooldb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

public class PolicyBitemporalHistoryId implements Serializable {

    private Integer id;
    private String vin;
    private Integer annualMileage;
    private String rentalCar;
    private Integer coverageAmt;
    private Date busStart;
    private Date busEnd;
    private Timestamp sysStart;
    private Timestamp sysEnd;
    private Timestamp transStart;
    private String sqlOperation;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVin() {
        return this.vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getAnnualMileage() {
        return this.annualMileage;
    }

    public void setAnnualMileage(Integer annualMileage) {
        this.annualMileage = annualMileage;
    }

    public String getRentalCar() {
        return this.rentalCar;
    }

    public void setRentalCar(String rentalCar) {
        this.rentalCar = rentalCar;
    }

    public Integer getCoverageAmt() {
        return this.coverageAmt;
    }

    public void setCoverageAmt(Integer coverageAmt) {
        this.coverageAmt = coverageAmt;
    }

    public Date getBusStart() {
        return this.busStart;
    }

    public void setBusStart(Date busStart) {
        this.busStart = busStart;
    }

    public Date getBusEnd() {
        return this.busEnd;
    }

    public void setBusEnd(Date busEnd) {
        this.busEnd = busEnd;
    }

    public Timestamp getSysStart() {
        return this.sysStart;
    }

    public void setSysStart(Timestamp sysStart) {
        this.sysStart = sysStart;
    }

    public Timestamp getSysEnd() {
        return this.sysEnd;
    }

    public void setSysEnd(Timestamp sysEnd) {
        this.sysEnd = sysEnd;
    }

    public Timestamp getTransStart() {
        return this.transStart;
    }

    public void setTransStart(Timestamp transStart) {
        this.transStart = transStart;
    }

    public String getSqlOperation() {
        return this.sqlOperation;
    }

    public void setSqlOperation(String sqlOperation) {
        this.sqlOperation = sqlOperation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolicyBitemporalHistory)) return false;
        final PolicyBitemporalHistory policyBitemporalHistory = (PolicyBitemporalHistory) o;
        return Objects.equals(getId(), policyBitemporalHistory.getId()) &&
                Objects.equals(getVin(), policyBitemporalHistory.getVin()) &&
                Objects.equals(getAnnualMileage(), policyBitemporalHistory.getAnnualMileage()) &&
                Objects.equals(getRentalCar(), policyBitemporalHistory.getRentalCar()) &&
                Objects.equals(getCoverageAmt(), policyBitemporalHistory.getCoverageAmt()) &&
                Objects.equals(getBusStart(), policyBitemporalHistory.getBusStart()) &&
                Objects.equals(getBusEnd(), policyBitemporalHistory.getBusEnd()) &&
                Objects.equals(getSysStart(), policyBitemporalHistory.getSysStart()) &&
                Objects.equals(getSysEnd(), policyBitemporalHistory.getSysEnd()) &&
                Objects.equals(getTransStart(), policyBitemporalHistory.getTransStart()) &&
                Objects.equals(getSqlOperation(), policyBitemporalHistory.getSqlOperation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getVin(),
                getAnnualMileage(),
                getRentalCar(),
                getCoverageAmt(),
                getBusStart(),
                getBusEnd(),
                getSysStart(),
                getSysEnd(),
                getTransStart(),
                getSqlOperation());
    }
}
