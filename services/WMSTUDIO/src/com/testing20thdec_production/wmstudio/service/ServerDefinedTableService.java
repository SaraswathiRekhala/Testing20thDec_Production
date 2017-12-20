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

import com.testing20thdec_production.wmstudio.ServerDefinedTable;

/**
 * Service object for domain model class {@link ServerDefinedTable}.
 */
public interface ServerDefinedTableService {

    /**
     * Creates a new ServerDefinedTable. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on ServerDefinedTable if any.
     *
     * @param serverDefinedTable Details of the ServerDefinedTable to be created; value cannot be null.
     * @return The newly created ServerDefinedTable.
     */
	ServerDefinedTable create(@Valid ServerDefinedTable serverDefinedTable);


	/**
	 * Returns ServerDefinedTable by given id if exists.
	 *
	 * @param serverdefinedtableId The id of the ServerDefinedTable to get; value cannot be null.
	 * @return ServerDefinedTable associated with the given serverdefinedtableId.
     * @throws EntityNotFoundException If no ServerDefinedTable is found.
	 */
	ServerDefinedTable getById(Integer serverdefinedtableId) throws EntityNotFoundException;

    /**
	 * Find and return the ServerDefinedTable by given id if exists, returns null otherwise.
	 *
	 * @param serverdefinedtableId The id of the ServerDefinedTable to get; value cannot be null.
	 * @return ServerDefinedTable associated with the given serverdefinedtableId.
	 */
	ServerDefinedTable findById(Integer serverdefinedtableId);


	/**
	 * Updates the details of an existing ServerDefinedTable. It replaces all fields of the existing ServerDefinedTable with the given serverDefinedTable.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on ServerDefinedTable if any.
     *
	 * @param serverDefinedTable The details of the ServerDefinedTable to be updated; value cannot be null.
	 * @return The updated ServerDefinedTable.
	 * @throws EntityNotFoundException if no ServerDefinedTable is found with given input.
	 */
	ServerDefinedTable update(@Valid ServerDefinedTable serverDefinedTable) throws EntityNotFoundException;

    /**
	 * Deletes an existing ServerDefinedTable with the given id.
	 *
	 * @param serverdefinedtableId The id of the ServerDefinedTable to be deleted; value cannot be null.
	 * @return The deleted ServerDefinedTable.
	 * @throws EntityNotFoundException if no ServerDefinedTable found with the given id.
	 */
	ServerDefinedTable delete(Integer serverdefinedtableId) throws EntityNotFoundException;

	/**
	 * Find all ServerDefinedTables matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching ServerDefinedTables.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<ServerDefinedTable> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all ServerDefinedTables matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching ServerDefinedTables.
     *
     * @see Pageable
     * @see Page
	 */
    Page<ServerDefinedTable> findAll(String query, Pageable pageable);

    /**
	 * Exports all ServerDefinedTables matching the given input query to the given exportType format.
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
	 * Retrieve the count of the ServerDefinedTables in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the ServerDefinedTable.
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

