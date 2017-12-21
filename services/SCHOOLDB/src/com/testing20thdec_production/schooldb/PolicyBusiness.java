/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.schooldb;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wavemaker.runtime.data.annotations.TableTemporal;

/**
 * PolicyBusiness generated by WaveMaker Studio.
 */
@TableTemporal(value = {TableTemporal.TemporalType.APPLICATION})
@Entity
@Table(name = "`POLICY_BUSINESS`")
public class PolicyBusiness implements Serializable {

    private Integer id;
    private String vin;
    private Integer annualMileage;
    private String rentalCar;
    private Integer coverageAmt;
    private Date busStart;
    private Date busEnd;
    private String sqlOperation;

    @Id
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`VIN`", nullable = true, length = 10)
    public String getVin() {
        return this.vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Column(name = "`ANNUAL_MILEAGE`", nullable = true, scale = 0, precision = 10)
    public Integer getAnnualMileage() {
        return this.annualMileage;
    }

    public void setAnnualMileage(Integer annualMileage) {
        this.annualMileage = annualMileage;
    }

    @Column(name = "`RENTAL_CAR`", nullable = true, length = 1)
    public String getRentalCar() {
        return this.rentalCar;
    }

    public void setRentalCar(String rentalCar) {
        this.rentalCar = rentalCar;
    }

    @Column(name = "`COVERAGE_AMT`", nullable = true, scale = 0, precision = 10)
    public Integer getCoverageAmt() {
        return this.coverageAmt;
    }

    public void setCoverageAmt(Integer coverageAmt) {
        this.coverageAmt = coverageAmt;
    }

    @Column(name = "`BUS_START`", nullable = false)
    public Date getBusStart() {
        return this.busStart;
    }

    public void setBusStart(Date busStart) {
        this.busStart = busStart;
    }

    @Column(name = "`BUS_END`", nullable = false)
    public Date getBusEnd() {
        return this.busEnd;
    }

    public void setBusEnd(Date busEnd) {
        this.busEnd = busEnd;
    }

    @Column(name = "`SQL_OPERATION`", nullable = true, length = 1)
    public String getSqlOperation() {
        return this.sqlOperation;
    }

    public void setSqlOperation(String sqlOperation) {
        this.sqlOperation = sqlOperation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolicyBusiness)) return false;
        final PolicyBusiness policyBusiness = (PolicyBusiness) o;
        return Objects.equals(getId(), policyBusiness.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

