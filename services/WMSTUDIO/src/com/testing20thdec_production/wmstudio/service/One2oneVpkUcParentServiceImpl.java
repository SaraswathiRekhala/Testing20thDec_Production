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

import com.testing20thdec_production.wmstudio.One2oneVpkUcParent;
import com.testing20thdec_production.wmstudio.One2oneVpkUcParentId;


/**
 * ServiceImpl object for domain model class One2oneVpkUcParent.
 *
 * @see One2oneVpkUcParent
 */
@Service("WMSTUDIO.One2oneVpkUcParentService")
@Validated
public class One2oneVpkUcParentServiceImpl implements One2oneVpkUcParentService {

    private static final Logger LOGGER = LoggerFactory.getLogger(One2oneVpkUcParentServiceImpl.class);


    @Autowired
    @Qualifier("WMSTUDIO.One2oneVpkUcParentDao")
    private WMGenericDao<One2oneVpkUcParent, One2oneVpkUcParentId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<One2oneVpkUcParent, One2oneVpkUcParentId> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
	public One2oneVpkUcParent create(One2oneVpkUcParent one2oneVpkUcParent) {
        LOGGER.debug("Creating a new One2oneVpkUcParent with information: {}", one2oneVpkUcParent);

        One2oneVpkUcParent one2oneVpkUcParentCreated = this.wmGenericDao.create(one2oneVpkUcParent);
        return one2oneVpkUcParentCreated;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneVpkUcParent getById(One2oneVpkUcParentId one2onevpkucparentId) throws EntityNotFoundException {
        LOGGER.debug("Finding One2oneVpkUcParent by id: {}", one2onevpkucparentId);
        One2oneVpkUcParent one2oneVpkUcParent = this.wmGenericDao.findById(one2onevpkucparentId);
        if (one2oneVpkUcParent == null){
            LOGGER.debug("No One2oneVpkUcParent found with id: {}", one2onevpkucparentId);
            throw new EntityNotFoundException(String.valueOf(one2onevpkucparentId));
        }
        return one2oneVpkUcParent;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneVpkUcParent findById(One2oneVpkUcParentId one2onevpkucparentId) {
        LOGGER.debug("Finding One2oneVpkUcParent by id: {}", one2onevpkucparentId);
        return this.wmGenericDao.findById(one2onevpkucparentId);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public One2oneVpkUcParent getByStringCol(String stringCol) {
        Map<String, Object> stringColMap = new HashMap<>();
        stringColMap.put("stringCol", stringCol);

        LOGGER.debug("Finding One2oneVpkUcParent by unique keys: {}", stringColMap);
        One2oneVpkUcParent one2oneVpkUcParent = this.wmGenericDao.findByUniqueKey(stringColMap);

        if (one2oneVpkUcParent == null){
            LOGGER.debug("No One2oneVpkUcParent found with given unique key values: {}", stringColMap);
            throw new EntityNotFoundException(String.valueOf(stringColMap));
        }

        return one2oneVpkUcParent;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneVpkUcParent update(One2oneVpkUcParent one2oneVpkUcParent) throws EntityNotFoundException {
        LOGGER.debug("Updating One2oneVpkUcParent with information: {}", one2oneVpkUcParent);
        this.wmGenericDao.update(one2oneVpkUcParent);

        One2oneVpkUcParentId one2onevpkucparentId = new One2oneVpkUcParentId();
        one2onevpkucparentId.setStringCol(one2oneVpkUcParent.getStringCol());
        one2onevpkucparentId.setDateCol(one2oneVpkUcParent.getDateCol());
        one2onevpkucparentId.setCharCol(one2oneVpkUcParent.getCharCol());
        one2onevpkucparentId.setClobCol(one2oneVpkUcParent.getClobCol());

        return this.wmGenericDao.findById(one2onevpkucparentId);
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneVpkUcParent delete(One2oneVpkUcParentId one2onevpkucparentId) throws EntityNotFoundException {
        LOGGER.debug("Deleting One2oneVpkUcParent with id: {}", one2onevpkucparentId);
        One2oneVpkUcParent deleted = this.wmGenericDao.findById(one2onevpkucparentId);
        if (deleted == null) {
            LOGGER.debug("No One2oneVpkUcParent found with id: {}", one2onevpkucparentId);
            throw new EntityNotFoundException(String.valueOf(one2onevpkucparentId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public Page<One2oneVpkUcParent> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all One2oneVpkUcParents");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<One2oneVpkUcParent> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all One2oneVpkUcParents");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table One2oneVpkUcParent to {} format", exportType);
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

