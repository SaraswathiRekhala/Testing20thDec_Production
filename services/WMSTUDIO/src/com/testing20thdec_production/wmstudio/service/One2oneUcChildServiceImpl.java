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
import org.springframework.context.annotation.Lazy;
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

import com.testing20thdec_production.wmstudio.One2oneUcChild;
import com.testing20thdec_production.wmstudio.One2oneUcChild1;


/**
 * ServiceImpl object for domain model class One2oneUcChild.
 *
 * @see One2oneUcChild
 */
@Service("WMSTUDIO.One2oneUcChildService")
@Validated
public class One2oneUcChildServiceImpl implements One2oneUcChildService {

    private static final Logger LOGGER = LoggerFactory.getLogger(One2oneUcChildServiceImpl.class);

    @Lazy
    @Autowired
	@Qualifier("WMSTUDIO.One2oneUcChild1Service")
	private One2oneUcChild1Service one2oneUcChild1Service;

    @Autowired
    @Qualifier("WMSTUDIO.One2oneUcChildDao")
    private WMGenericDao<One2oneUcChild, String> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<One2oneUcChild, String> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
	public One2oneUcChild create(One2oneUcChild one2oneUcChild) {
        LOGGER.debug("Creating a new One2oneUcChild with information: {}", one2oneUcChild);
        One2oneUcChild1 one2oneUcChild1 = one2oneUcChild.getOne2oneUcChild1();

        One2oneUcChild one2oneUcChildCreated = this.wmGenericDao.create(one2oneUcChild);
        if(one2oneUcChild1 != null) {
            LOGGER.debug("Creating a new child One2oneUcChild1 with information: {}", one2oneUcChild1);
            one2oneUcChild1.setOne2oneUcChild(one2oneUcChildCreated);
            one2oneUcChild1Service.create(one2oneUcChild1);
        }
        return one2oneUcChildCreated;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneUcChild getById(String one2oneucchildId) throws EntityNotFoundException {
        LOGGER.debug("Finding One2oneUcChild by id: {}", one2oneucchildId);
        One2oneUcChild one2oneUcChild = this.wmGenericDao.findById(one2oneucchildId);
        if (one2oneUcChild == null){
            LOGGER.debug("No One2oneUcChild found with id: {}", one2oneucchildId);
            throw new EntityNotFoundException(String.valueOf(one2oneucchildId));
        }
        return one2oneUcChild;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneUcChild findById(String one2oneucchildId) {
        LOGGER.debug("Finding One2oneUcChild by id: {}", one2oneucchildId);
        return this.wmGenericDao.findById(one2oneucchildId);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public One2oneUcChild getByByteCol(Byte byteCol) {
        Map<String, Object> byteColMap = new HashMap<>();
        byteColMap.put("byteCol", byteCol);

        LOGGER.debug("Finding One2oneUcChild by unique keys: {}", byteColMap);
        One2oneUcChild one2oneUcChild = this.wmGenericDao.findByUniqueKey(byteColMap);

        if (one2oneUcChild == null){
            LOGGER.debug("No One2oneUcChild found with given unique key values: {}", byteColMap);
            throw new EntityNotFoundException(String.valueOf(byteColMap));
        }

        return one2oneUcChild;
    }

	@Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneUcChild update(One2oneUcChild one2oneUcChild) throws EntityNotFoundException {
        LOGGER.debug("Updating One2oneUcChild with information: {}", one2oneUcChild);
        this.wmGenericDao.update(one2oneUcChild);

        String one2oneucchildId = one2oneUcChild.getEmailId();

        return this.wmGenericDao.findById(one2oneucchildId);
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
	@Override
	public One2oneUcChild delete(String one2oneucchildId) throws EntityNotFoundException {
        LOGGER.debug("Deleting One2oneUcChild with id: {}", one2oneucchildId);
        One2oneUcChild deleted = this.wmGenericDao.findById(one2oneucchildId);
        if (deleted == null) {
            LOGGER.debug("No One2oneUcChild found with id: {}", one2oneucchildId);
            throw new EntityNotFoundException(String.valueOf(one2oneucchildId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public Page<One2oneUcChild> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all One2oneUcChilds");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<One2oneUcChild> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all One2oneUcChilds");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table One2oneUcChild to {} format", exportType);
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


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service One2oneUcChild1Service instance
	 */
	protected void setOne2oneUcChild1Service(One2oneUcChild1Service service) {
        this.one2oneUcChild1Service = service;
    }

}

