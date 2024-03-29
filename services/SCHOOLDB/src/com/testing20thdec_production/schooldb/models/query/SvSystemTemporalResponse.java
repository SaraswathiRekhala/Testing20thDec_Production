/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.schooldb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class SvSystemTemporalResponse implements Serializable {


    @ColumnAlias("ID")
    private Integer id;

    @ColumnAlias("SYS_START")
    private Timestamp sysStart;

    @ColumnAlias("SYS_END")
    private Timestamp sysEnd;

    @ColumnAlias("VIN")
    private String vin;

    @ColumnAlias("COVERAGE_AMT")
    private Integer coverageAmt;

    @ColumnAlias("RENTAL_CAR")
    private String rentalCar;

    @ColumnAlias("ANNUAL_MILEAGE")
    private Integer annualMileage;

    @ColumnAlias("SQL_OPERATION")
    private String sqlOperation;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getVin() {
        return this.vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Integer getCoverageAmt() {
        return this.coverageAmt;
    }

    public void setCoverageAmt(Integer coverageAmt) {
        this.coverageAmt = coverageAmt;
    }

    public String getRentalCar() {
        return this.rentalCar;
    }

    public void setRentalCar(String rentalCar) {
        this.rentalCar = rentalCar;
    }

    public Integer getAnnualMileage() {
        return this.annualMileage;
    }

    public void setAnnualMileage(Integer annualMileage) {
        this.annualMileage = annualMileage;
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
        if (!(o instanceof SvSystemTemporalResponse)) return false;
        final SvSystemTemporalResponse svSystemTemporalResponse = (SvSystemTemporalResponse) o;
        return Objects.equals(getId(), svSystemTemporalResponse.getId()) &&
                Objects.equals(getSysStart(), svSystemTemporalResponse.getSysStart()) &&
                Objects.equals(getSysEnd(), svSystemTemporalResponse.getSysEnd()) &&
                Objects.equals(getVin(), svSystemTemporalResponse.getVin()) &&
                Objects.equals(getCoverageAmt(), svSystemTemporalResponse.getCoverageAmt()) &&
                Objects.equals(getRentalCar(), svSystemTemporalResponse.getRentalCar()) &&
                Objects.equals(getAnnualMileage(), svSystemTemporalResponse.getAnnualMileage()) &&
                Objects.equals(getSqlOperation(), svSystemTemporalResponse.getSqlOperation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getSysStart(),
                getSysEnd(),
                getVin(),
                getCoverageAmt(),
                getRentalCar(),
                getAnnualMileage(),
                getSqlOperation());
    }
}
