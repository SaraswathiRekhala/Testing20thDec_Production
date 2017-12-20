/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.testing20thdec_production.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wavemaker.runtime.data.dao.query.WMQueryExecutor;

import com.testing20thdec_production.wmstudio.models.query.SvInsertQueryRequest;
import com.testing20thdec_production.wmstudio.models.query.SvInsertQueryServerDefRequest;

@Service
public class WMSTUDIOQueryExecutorServiceImpl implements WMSTUDIOQueryExecutorService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WMSTUDIOQueryExecutorServiceImpl.class);

    @Autowired
    @Qualifier("WMSTUDIOWMQueryExecutor")
    private WMQueryExecutor queryExecutor;

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Integer executeSV_InsertQuery(SvInsertQueryRequest svInsertQueryRequest) {
        Map params = new HashMap(17);

        params.put("PK_COLUMN", svInsertQueryRequest.getPkColumn());
        params.put("BYTE_COLUMN", svInsertQueryRequest.getByteColumn());
        params.put("SHORT_COLUMN", svInsertQueryRequest.getShortColumn());
        params.put("INT_COLUMN", svInsertQueryRequest.getIntColumn());
        params.put("FLOAT_COLUMN", svInsertQueryRequest.getFloatColumn());
        params.put("DOUBLE_COLUMN", svInsertQueryRequest.getDoubleColumn());
        params.put("BIGINT_COLUMN", svInsertQueryRequest.getBigintColumn());
        params.put("BIGDEC_COLUMN", svInsertQueryRequest.getBigdecColumn());
        params.put("CHAR_COLUMN", svInsertQueryRequest.getCharColumn());
        params.put("STRING_COLUMN", svInsertQueryRequest.getStringColumn());
        params.put("BOOLEAN_COLUMN", svInsertQueryRequest.getBooleanColumn());
        params.put("BOOLEAN_Y_N_COLUMN", svInsertQueryRequest.getBooleanYNColumn());
        params.put("DATETIME_COLUMN", svInsertQueryRequest.getDatetimeColumn());
        params.put("TIMESTAMP_COLUMN", svInsertQueryRequest.getTimestampColumn());
        params.put("BLOB_COLUMN", svInsertQueryRequest.getBlobColumn());
        params.put("TEXT_COLUMN", svInsertQueryRequest.getTextColumn());
        params.put("CLOB_COLUMN", svInsertQueryRequest.getClobColumn());

        return queryExecutor.executeNamedQueryForUpdate("SV_InsertQuery", params);
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
    public Integer executeSV_InsertQuery_ServerDef(SvInsertQueryServerDefRequest svInsertQueryServerDefRequest) {
        Map params = new HashMap(13);

        params.put("PK_COLUMN", svInsertQueryServerDefRequest.getPkColumn());
        params.put("SHORT_COLUMN", svInsertQueryServerDefRequest.getShortColumn());
        params.put("FLOAT_COLUMN", svInsertQueryServerDefRequest.getFloatColumn());
        params.put("DOUBLE_COLUMN", svInsertQueryServerDefRequest.getDoubleColumn());
        params.put("BIGINT_COLUMN", svInsertQueryServerDefRequest.getBigintColumn());
        params.put("BIGDEC_COLUMN", svInsertQueryServerDefRequest.getBigdecColumn());
        params.put("CHAR_COLUMN", svInsertQueryServerDefRequest.getCharColumn());
        params.put("BOOLEAN_COLUMN", svInsertQueryServerDefRequest.getBooleanColumn());
        params.put("BOOLEAN_Y_N_COLUMN", svInsertQueryServerDefRequest.getBooleanYNColumn());
        params.put("TIMESTAMP_COLUMN", svInsertQueryServerDefRequest.getTimestampColumn());
        params.put("BLOB_COLUMN", svInsertQueryServerDefRequest.getBlobColumn());
        params.put("TEXT_COLUMN", svInsertQueryServerDefRequest.getTextColumn());
        params.put("CLOB_COLUMN", svInsertQueryServerDefRequest.getClobColumn());

        return queryExecutor.executeNamedQueryForUpdate("SV_InsertQuery_ServerDef", params);
    }

}

