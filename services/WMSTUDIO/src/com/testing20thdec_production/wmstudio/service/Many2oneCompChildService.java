/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.wmstudio.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing20thdec_production.wmstudio.Many2oneCompChild;
import com.testing20thdec_production.wmstudio.Many2oneCompChildId;

/**
 * Service object for domain model class {@link Many2oneCompChild}.
 */
public interface Many2oneCompChildService {

    /**
     * Creates a new Many2oneCompChild. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on Many2oneCompChild if any.
     *
     * @param many2oneCompChild Details of the Many2oneCompChild to be created; value cannot be null.
     * @return The newly created Many2oneCompChild.
     */
	Many2oneCompChild create(@Valid Many2oneCompChild many2oneCompChild);


	/**
	 * Returns Many2oneCompChild by given id if exists.
	 *
	 * @param many2onecompchildId The id of the Many2oneCompChild to get; value cannot be null.
	 * @return Many2oneCompChild associated with the given many2onecompchildId.
     * @throws EntityNotFoundException If no Many2oneCompChild is found.
	 */
	Many2oneCompChild getById(Many2oneCompChildId many2onecompchildId) throws EntityNotFoundException;

    /**
	 * Find and return the Many2oneCompChild by given id if exists, returns null otherwise.
	 *
	 * @param many2onecompchildId The id of the Many2oneCompChild to get; value cannot be null.
	 * @return Many2oneCompChild associated with the given many2onecompchildId.
	 */
	Many2oneCompChild findById(Many2oneCompChildId many2onecompchildId);


	/**
	 * Updates the details of an existing Many2oneCompChild. It replaces all fields of the existing Many2oneCompChild with the given many2oneCompChild.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on Many2oneCompChild if any.
     *
	 * @param many2oneCompChild The details of the Many2oneCompChild to be updated; value cannot be null.
	 * @return The updated Many2oneCompChild.
	 * @throws EntityNotFoundException if no Many2oneCompChild is found with given input.
	 */
	Many2oneCompChild update(@Valid Many2oneCompChild many2oneCompChild) throws EntityNotFoundException;

    /**
	 * Deletes an existing Many2oneCompChild with the given id.
	 *
	 * @param many2onecompchildId The id of the Many2oneCompChild to be deleted; value cannot be null.
	 * @return The deleted Many2oneCompChild.
	 * @throws EntityNotFoundException if no Many2oneCompChild found with the given id.
	 */
	Many2oneCompChild delete(Many2oneCompChildId many2onecompchildId) throws EntityNotFoundException;

	/**
	 * Find all Many2oneCompChilds matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Many2oneCompChilds.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<Many2oneCompChild> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all Many2oneCompChilds matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching Many2oneCompChilds.
     *
     * @see Pageable
     * @see Page
	 */
    Page<Many2oneCompChild> findAll(String query, Pageable pageable);

    /**
	 * Exports all Many2oneCompChilds matching the given input query to the given exportType format.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param exportType The format in which to export the data; value cannot be null.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
     * @return The Downloadable file in given export type.
     *
     * @see Pageable
     * @see ExportType
     * @see Downloadable
	 */
    Downloadable export(ExportType exportType, String query, Pageable pageable);

	/**
	 * Retrieve the count of the Many2oneCompChilds in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the Many2oneCompChild.
	 */
	long count(String query);

	/**
	 * Retrieve aggregated values with matching aggregation info.
     *
     * @param aggregationInfo info related to aggregations.
     * @param pageable Details of the pagination information along with the sorting options. If null exports all matching records.
	 * @return Paginated data with included fields.

     * @see AggregationInfo
     * @see Pageable
     * @see Page
	 */
	Page<Map<String, Object>> getAggregatedValues(AggregationInfo aggregationInfo, Pageable pageable);


}

