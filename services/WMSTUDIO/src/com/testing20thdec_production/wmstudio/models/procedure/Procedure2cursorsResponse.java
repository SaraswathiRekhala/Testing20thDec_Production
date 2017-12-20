/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class Procedure2cursorsResponse implements Serializable {


    @ColumnAlias("REGIONSDATA")
    private List<Procedure2cursorsResponseRegionsdata> regionsdata;

    @ColumnAlias("JOBSDATA")
    private List<Procedure2cursorsResponseJobsdata> jobsdata;

    public List<Procedure2cursorsResponseRegionsdata> getRegionsdata() {
        return this.regionsdata;
    }

    public void setRegionsdata(List<Procedure2cursorsResponseRegionsdata> regionsdata) {
        this.regionsdata = regionsdata;
    }

    public List<Procedure2cursorsResponseJobsdata> getJobsdata() {
        return this.jobsdata;
    }

    public void setJobsdata(List<Procedure2cursorsResponseJobsdata> jobsdata) {
        this.jobsdata = jobsdata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Procedure2cursorsResponse)) return false;
        final Procedure2cursorsResponse procedure2cursorsResponse = (Procedure2cursorsResponse) o;
        return Objects.equals(getRegionsdata(), procedure2cursorsResponse.getRegionsdata()) &&
                Objects.equals(getJobsdata(), procedure2cursorsResponse.getJobsdata());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegionsdata(),
                getJobsdata());
    }
}
