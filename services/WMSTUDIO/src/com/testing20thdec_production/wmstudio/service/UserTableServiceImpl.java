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

import com.testing20thdec_production.wmstudio.UserTable;


/**
 * ServiceImpl object for domain model class UserTable.
 *
 * @see UserTable
 */
@Service("WMSTUDIO.UserTableService")
@Validated
public class UserTableServiceImpl implements UserTableService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserTableServiceImpl.class);


    @Autowired
    @Qualifier("WMSTUDIO.UserTableDao")
    private WMGenericDao<UserTable, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<UserTable, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
	public UserTable create(UserTable userTable) {
        LOGGER.debug("Creating a new UserTable with information: {}", userTable);

        UserTable userTableCreated = this.wmGenericDao.create(userTable);
        return userTableCreated;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public UserTable getById(Integer usertableId) throws EntityNotFoundException {
        LOGGER.debug("Finding UserTable by id: {}", usertableId);
        UserTable userTable = this.wmGenericDao.findById(usertableId);
        if (userTable == null){
            LOGGER.debug("No UserTable found with id: {}", usertableId);
            throw new EntityNotFoundException(String.valueOf(usertableId));
        }
        return userTable;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public UserTable findById(Integer usertableId) {
        LOGGER.debug("Finding UserTable by id: {}", usertableId);
        return this.wmGenericDao.findById(usertableId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
	@Override
	public UserTable update(UserTable userTable) throws EntityNotFoundException {
        LOGGER.debug("Updating UserTable with information: {}", userTable);
        this.wmGenericDao.update(userTable);

        Integer usertableId = userTable.getUserId();

        return this.wmGenericDao.findById(usertableId);
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
	@Override
	public UserTable delete(Integer usertableId) throws EntityNotFoundException {
        LOGGER.debug("Deleting UserTable with id: {}", usertableId);
        UserTable deleted = this.wmGenericDao.findById(usertableId);
        if (deleted == null) {
            LOGGER.debug("No UserTable found with id: {}", usertableId);
            throw new EntityNotFoundException(String.valueOf(usertableId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public Page<UserTable> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all UserTables");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<UserTable> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all UserTables");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table UserTable to {} format", exportType);
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

