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

import com.testing20thdec_production.schooldb.Policy;


/**
 * ServiceImpl object for domain model class Policy.
 *
 * @see Policy
 */
@Service("SCHOOLDB.PolicyService")
@Validated
public class PolicyServiceImpl implements PolicyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyServiceImpl.class);


    @Autowired
    @Qualifier("SCHOOLDB.PolicyDao")
    private WMGenericDao<Policy, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Policy, Integer> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "SCHOOLDBTransactionManager")
    @Override
	public Policy create(Policy policy) {
        LOGGER.debug("Creating a new Policy with information: {}", policy);

        Policy policyCreated = this.wmGenericDao.create(policy);
        return policyCreated;
    }

	@Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
	public Policy getById(Integer policyId) throws EntityNotFoundException {
        LOGGER.debug("Finding Policy by id: {}", policyId);
        Policy policy = this.wmGenericDao.findById(policyId);
        if (policy == null){
            LOGGER.debug("No Policy found with id: {}", policyId);
            throw new EntityNotFoundException(String.valueOf(policyId));
        }
        return policy;
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
	public Policy findById(Integer policyId) {
        LOGGER.debug("Finding Policy by id: {}", policyId);
        return this.wmGenericDao.findById(policyId);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "SCHOOLDBTransactionManager")
	@Override
	public Policy update(Policy policy) throws EntityNotFoundException {
        LOGGER.debug("Updating Policy with information: {}", policy);
        this.wmGenericDao.update(policy);

        Integer policyId = policy.getId();

        return this.wmGenericDao.findById(policyId);
    }

    @Transactional(value = "SCHOOLDBTransactionManager")
	@Override
	public Policy delete(Integer policyId) throws EntityNotFoundException {
        LOGGER.debug("Deleting Policy with id: {}", policyId);
        Policy deleted = this.wmGenericDao.findById(policyId);
        if (deleted == null) {
            LOGGER.debug("No Policy found with id: {}", policyId);
            throw new EntityNotFoundException(String.valueOf(policyId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
	@Override
	public Page<Policy> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Policies");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Page<Policy> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Policies");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Page<Policy> findHistory(String systemClause, String query, Pageable pageable) {
        List<PeriodClause> periodClauses = new ArrayList<>(2);
        if(systemClause != null && !systemClause.isEmpty()) {
            periodClauses.add(new PeriodClauseWrapper(TableTemporal.TemporalType.SYSTEM, systemClause));
        }
        return findHistory(periodClauses, query, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Page<Policy> findHistory(List<PeriodClause> periodClauses, String query, Pageable pageable) {
        LOGGER.debug("Finding history data for Policy");
        return this.wmGenericDao.findHistory(periodClauses, query, pageable);
    }

    @Transactional(readOnly = true, value = "SCHOOLDBTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service SCHOOLDB for table Policy to {} format", exportType);
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

