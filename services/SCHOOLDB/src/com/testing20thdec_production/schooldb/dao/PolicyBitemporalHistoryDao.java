/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.schooldb.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.testing20thdec_production.schooldb.PolicyBitemporalHistory;
import com.testing20thdec_production.schooldb.PolicyBitemporalHistoryId;

/**
 * Specifies methods used to obtain and modify PolicyBitemporalHistory related information
 * which is stored in the database.
 */
@Repository("SCHOOLDB.PolicyBitemporalHistoryDao")
public class PolicyBitemporalHistoryDao extends WMGenericDaoImpl<PolicyBitemporalHistory, PolicyBitemporalHistoryId> {

    @Autowired
    @Qualifier("SCHOOLDBTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}

