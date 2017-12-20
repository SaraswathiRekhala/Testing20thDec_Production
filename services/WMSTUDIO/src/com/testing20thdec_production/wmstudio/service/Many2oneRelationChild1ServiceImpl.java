/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.List;
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

import com.testing20thdec_production.wmstudio.Many2oneCompParent;
import com.testing20thdec_production.wmstudio.Many2oneRelationChild1;
import com.testing20thdec_production.wmstudio.Many2oneRelationChild1Id;


/**
 * ServiceImpl object for domain model class Many2oneRelationChild1.
 *
 * @see Many2oneRelationChild1
 */
@Service("WMSTUDIO.Many2oneRelationChild1Service")
@Validated
public class Many2oneRelationChild1ServiceImpl implements Many2oneRelationChild1Service {

    private static final Logger LOGGER = LoggerFactory.getLogger(Many2oneRelationChild1ServiceImpl.class);

    @Lazy
    @Autowired
	@Qualifier("WMSTUDIO.Many2oneCompParentService")
	private Many2oneCompParentService many2oneCompParentService;

    @Autowired
    @Qualifier("WMSTUDIO.Many2oneRelationChild1Dao")
    private WMGenericDao<Many2oneRelationChild1, Many2oneRelationChild1Id> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Many2oneRelationChild1, Many2oneRelationChild1Id> wmGenericDao) {
        this.wmGenericDao = wmGenericDao;
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
    @Override
	public Many2oneRelationChild1 create(Many2oneRelationChild1 many2oneRelationChild1) {
        LOGGER.debug("Creating a new Many2oneRelationChild1 with information: {}", many2oneRelationChild1);
        List<Many2oneCompParent> many2oneCompParents = many2oneRelationChild1.getMany2oneCompParents();

        Many2oneRelationChild1 many2oneRelationChild1Created = this.wmGenericDao.create(many2oneRelationChild1);
        if(many2oneCompParents != null) {
            for(Many2oneCompParent _many2oneCompParent : many2oneCompParents) {
                _many2oneCompParent.setMany2oneRelationChild1(many2oneRelationChild1Created);
                LOGGER.debug("Creating a new child Many2oneCompParent with information: {}", _many2oneCompParent);
                many2oneCompParentService.create(_many2oneCompParent);
            }
        }
        return many2oneRelationChild1Created;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public Many2oneRelationChild1 getById(Many2oneRelationChild1Id many2onerelationchild1Id) throws EntityNotFoundException {
        LOGGER.debug("Finding Many2oneRelationChild1 by id: {}", many2onerelationchild1Id);
        Many2oneRelationChild1 many2oneRelationChild1 = this.wmGenericDao.findById(many2onerelationchild1Id);
        if (many2oneRelationChild1 == null){
            LOGGER.debug("No Many2oneRelationChild1 found with id: {}", many2onerelationchild1Id);
            throw new EntityNotFoundException(String.valueOf(many2onerelationchild1Id));
        }
        return many2oneRelationChild1;
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public Many2oneRelationChild1 findById(Many2oneRelationChild1Id many2onerelationchild1Id) {
        LOGGER.debug("Finding Many2oneRelationChild1 by id: {}", many2onerelationchild1Id);
        return this.wmGenericDao.findById(many2onerelationchild1Id);
    }


	@Transactional(rollbackFor = EntityNotFoundException.class, value = "WMSTUDIOTransactionManager")
	@Override
	public Many2oneRelationChild1 update(Many2oneRelationChild1 many2oneRelationChild1) throws EntityNotFoundException {
        LOGGER.debug("Updating Many2oneRelationChild1 with information: {}", many2oneRelationChild1);
        this.wmGenericDao.update(many2oneRelationChild1);

        Many2oneRelationChild1Id many2onerelationchild1Id = new Many2oneRelationChild1Id();
        many2onerelationchild1Id.setByteId(many2oneRelationChild1.getByteId());
        many2onerelationchild1Id.setStringId(many2oneRelationChild1.getStringId());

        return this.wmGenericDao.findById(many2onerelationchild1Id);
    }

    @Transactional(value = "WMSTUDIOTransactionManager")
	@Override
	public Many2oneRelationChild1 delete(Many2oneRelationChild1Id many2onerelationchild1Id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Many2oneRelationChild1 with id: {}", many2onerelationchild1Id);
        Many2oneRelationChild1 deleted = this.wmGenericDao.findById(many2onerelationchild1Id);
        if (deleted == null) {
            LOGGER.debug("No Many2oneRelationChild1 found with id: {}", many2onerelationchild1Id);
            throw new EntityNotFoundException(String.valueOf(many2onerelationchild1Id));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

	@Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
	@Override
	public Page<Many2oneRelationChild1> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all Many2oneRelationChild1s");
        return this.wmGenericDao.search(queryFilters, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Many2oneRelationChild1> findAll(String query, Pageable pageable) {
        LOGGER.debug("Finding all Many2oneRelationChild1s");
        return this.wmGenericDao.searchByQuery(query, pageable);
    }

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Downloadable export(ExportType exportType, String query, Pageable pageable) {
        LOGGER.debug("exporting data in the service WMSTUDIO for table Many2oneRelationChild1 to {} format", exportType);
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

    @Transactional(readOnly = true, value = "WMSTUDIOTransactionManager")
    @Override
    public Page<Many2oneCompParent> findAssociatedMany2oneCompParents(Byte byteId, String stringId, Pageable pageable) {
        LOGGER.debug("Fetching all associated many2oneCompParents");

        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("many2oneRelationChild1.byteId = '" + byteId + "'");
        queryBuilder.append(" and ");
        queryBuilder.append("many2oneRelationChild1.stringId = '" + stringId + "'");

        return many2oneCompParentService.findAll(queryBuilder.toString(), pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service Many2oneCompParentService instance
	 */
	protected void setMany2oneCompParentService(Many2oneCompParentService service) {
        this.many2oneCompParentService = service;
    }

}

