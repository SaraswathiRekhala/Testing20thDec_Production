/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing20thdec_production.wmstudio.BooleanTable;


/**
 * ServiceImpl object for domain model class BooleanTable.
 *
 * @see BooleanTable
 */
@Service("WMSTUDIO.BooleanTableService")
@Validated
public class BooleanTableServiceImpl implements BooleanTableService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BooleanTableServiceImpl.class);


    @Autowired
    @Qualifier("WMSTUDIO.BooleanTableDao")
    private WMGenericDao<BooleanTable, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<BooleanTable, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
	public BooleanTable create(BooleanTable booleanTable) {
        LOGGER.debug("Creating a new BooleanTable with information: {}", booleanTable);

        BooleanTable booleanTableCreated = this.wmGenericDao.create(booleanTable);
        return booleanTableCreated;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public BooleanTable getById(Integer booleantableId) throws EntityNotFoundException {
        LOGGER.debug("Finding BooleanTable by id: {}", booleantableId);
        BooleanTable booleanTable = this.wmGenericDao.findById(booleantableId);
        if (booleanTable == null){
            LOGGER.debug("No BooleanTable found with id: {}", booleantableId);
            throw new EntityNotFoundException(String.valueOf(booleantableId));
        }
        return booleanTable;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public BooleanTable findById(Integer booleantableId) {
        LOGGER.debug("Finding BooleanTable by id: {}", booleantableId);
        return this.wmGenericDao.findById(booleantableId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
	@Override
	public BooleanTable update(BooleanTable booleanTable) throws EntityNotFoundException {
        LOGGER.debug("Updating BooleanTable with information: {}", booleanTable);
        this.wmGenericDao.update(booleanTable);

        Integer booleantableId = booleanTable.getSeqId();

        return this.wmGenericDao.findById(booleantableId);
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
	@Override
	public BooleanTable delete(Integer booleantableId) throws EntityNotFoundException {
        LOGGER.debug("Deleting BooleanTable with id: {}", booleantableId);
        BooleanTable deleted = this.wmGenericDao.findById(booleantableId);
        if (deleted == null) {
            LOGGER.debug("No BooleanTable found with id: {}", booleantableId);
            throw new EntityNotFoundException(String.valueOf(booleantableId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public Page<BooleanTable> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all BooleanTables");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<BooleanTable> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all BooleanTables");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table BooleanTable to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

