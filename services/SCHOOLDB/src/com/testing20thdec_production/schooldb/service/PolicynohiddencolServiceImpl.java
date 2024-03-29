/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.schooldb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.ArrayList;
import java.util.List;
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

import com.wavemaker.runtime.data.annotations.TableTemporal;
import com.wavemaker.runtime.data.dao.WMGenericDao;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.data.periods.PeriodClause;
import com.wavemaker.runtime.data.periods.PeriodClauseWrapper;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing20thdec_production.schooldb.Policynohiddencol;


/**
 * ServiceImpl object for domain model class Policynohiddencol.
 *
 * @see Policynohiddencol
 */
@Service("SCHOOLDB.PolicynohiddencolService")
@Validated
public class PolicynohiddencolServiceImpl implements PolicynohiddencolService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicynohiddencolServiceImpl.class);


    @Autowired
    @Qualifier("SCHOOLDB.PolicynohiddencolDao")
    private WMGenericDao<Policynohiddencol, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Policynohiddencol, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SCHOOLDBTransactionManager")
    @Override
	public Policynohiddencol create(Policynohiddencol policynohiddencol) {
        LOGGER.debug("Creating a new Policynohiddencol with information: {}", policynohiddencol);

        Policynohiddencol policynohiddencolCreated = this.wmGenericDao.create(policynohiddencol);
        return policynohiddencolCreated;
    }

	@Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
	public Policynohiddencol getById(Integer policynohiddencolId) throws EntityNotFoundException {
        LOGGER.debug("Finding Policynohiddencol by id: {}", policynohiddencolId);
        Policynohiddencol policynohiddencol = this.wmGenericDao.findById(policynohiddencolId);
        if (policynohiddencol == null){
            LOGGER.debug("No Policynohiddencol found with id: {}", policynohiddencolId);
            throw new EntityNotFoundException(String.valueOf(policynohiddencolId));
        }
        return policynohiddencol;
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
	public Policynohiddencol findById(Integer policynohiddencolId) {
        LOGGER.debug("Finding Policynohiddencol by id: {}", policynohiddencolId);
        return this.wmGenericDao.findById(policynohiddencolId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "SCHOOLDBTransactionManager")
	@Override
	public Policynohiddencol update(Policynohiddencol policynohiddencol) throws EntityNotFoundException {
        LOGGER.debug("Updating Policynohiddencol with information: {}", policynohiddencol);
        this.wmGenericDao.update(policynohiddencol);

        Integer policynohiddencolId = policynohiddencol.getId();

        return this.wmGenericDao.findById(policynohiddencolId);
    }

    @Transactional(value = "SCHOOLDBTransactionManager")
	@Override
	public Policynohiddencol delete(Integer policynohiddencolId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Policynohiddencol with id: {}", policynohiddencolId);
        Policynohiddencol deleted = this.wmGenericDao.findById(policynohiddencolId);
        if (deleted == null) {
            LOGGER.debug("No Policynohiddencol found with id: {}", policynohiddencolId);
            throw new EntityNotFoundException(String.valueOf(policynohiddencolId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
	public Page<Policynohiddencol> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Policynohiddencols");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Page<Policynohiddencol> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Policynohiddencols");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Page<Policynohiddencol> findHistory(String systemClause, String query, Pageable pageable) {
        List<PeriodClause> periodClauses = new ArrayList<>(2);
        if(systemClause != null && !systemClause.isEmpty()) {
            periodClauses.add(new PeriodClauseWrapper(TableTemporal.TemporalType.SYSTEM, systemClause));
        }
        return findHistory(periodClauses, query, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Page<Policynohiddencol> findHistory(List<PeriodClause> periodClauses, String query, Pageable pageable) {
        LOGGER.debug("Finding history data for Policynohiddencol");
        return this.wmGenericDao.findHistory(periodClauses, query, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SCHOOLDB for table Policynohiddencol to {} format", exportType);
        return this.wmGenericDao.export(exportType, query, pageable);
    }

	@Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
	public long count(String query) {
        return this.wmGenericDao.count(query);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
    public Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable) {
        return this.wmGenericDao.getAggregatedValues(aggregationInfo, pageable);
    }



}

