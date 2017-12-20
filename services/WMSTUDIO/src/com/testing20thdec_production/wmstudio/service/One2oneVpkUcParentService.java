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

import com.testing20thdec_production.wmstudio.One2oneVpkUcParent;
import com.testing20thdec_production.wmstudio.One2oneVpkUcParentId;

/**
 * Service object for domain model class {@link One2oneVpkUcParent}.
 */
public interface One2oneVpkUcParentService {

    /**
     * Creates a new One2oneVpkUcParent. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on One2oneVpkUcParent if any.
     *
     * @param one2oneVpkUcParent Details of the One2oneVpkUcParent to be created; value cannot be null.
     * @return The newly created One2oneVpkUcParent.
     */
	One2oneVpkUcParent create(@Valid One2oneVpkUcParent one2oneVpkUcParent);


	/**
	 * Returns One2oneVpkUcParent by given id if exists.
	 *
	 * @param one2onevpkucparentId The id of the One2oneVpkUcParent to get; value cannot be null.
	 * @return One2oneVpkUcParent associated with the given one2onevpkucparentId.
     * @throws EntityNotFoundException If no One2oneVpkUcParent is found.
	 */
	One2oneVpkUcParent getById(One2oneVpkUcParentId one2onevpkucparentId) throws EntityNotFoundException;

    /**
	 * Find and return the One2oneVpkUcParent by given id if exists, returns null otherwise.
	 *
	 * @param one2onevpkucparentId The id of the One2oneVpkUcParent to get; value cannot be null.
	 * @return One2oneVpkUcParent associated with the given one2onevpkucparentId.
	 */
	One2oneVpkUcParent findById(One2oneVpkUcParentId one2onevpkucparentId);

    /**
	 * Find and return the One2oneVpkUcParent for given stringCol  if exists.
	 *
	 * @param stringCol value of stringCol; value cannot be null.
	 * @return One2oneVpkUcParent associated with the given inputs.
     * @throws EntityNotFoundException if no matching One2oneVpkUcParent found.
	 */
    One2oneVpkUcParent getByStringCol(String stringCol)throws EntityNotFoundException;

	/**
	 * Updates the details of an existing One2oneVpkUcParent. It replaces all fields of the existing One2oneVpkUcParent with the given one2oneVpkUcParent.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on One2oneVpkUcParent if any.
     *
	 * @param one2oneVpkUcParent The details of the One2oneVpkUcParent to be updated; value cannot be null.
	 * @return The updated One2oneVpkUcParent.
	 * @throws EntityNotFoundException if no One2oneVpkUcParent is found with given input.
	 */
	One2oneVpkUcParent update(@Valid One2oneVpkUcParent one2oneVpkUcParent) throws EntityNotFoundException;

    /**
	 * Deletes an existing One2oneVpkUcParent with the given id.
	 *
	 * @param one2onevpkucparentId The id of the One2oneVpkUcParent to be deleted; value cannot be null.
	 * @return The deleted One2oneVpkUcParent.
	 * @throws EntityNotFoundException if no One2oneVpkUcParent found with the given id.
	 */
	One2oneVpkUcParent delete(One2oneVpkUcParentId one2onevpkucparentId) throws EntityNotFoundException;

	/**
	 * Find all One2oneVpkUcParents matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching One2oneVpkUcParents.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<One2oneVpkUcParent> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all One2oneVpkUcParents matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching One2oneVpkUcParents.
     *
     * @see Pageable
     * @see Page
	 */
    Page<One2oneVpkUcParent> findAll(String query, Pageable pageable);

    /**
	 * Exports all One2oneVpkUcParents matching the given input query to the given exportType format.
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
	 * Retrieve the count of the One2oneVpkUcParents in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the One2oneVpkUcParent.
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

