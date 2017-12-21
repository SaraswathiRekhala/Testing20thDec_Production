/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.schooldb.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.data.periods.PeriodClause;
import com.wavemaker.runtime.file.model.Downloadable;

import com.testing20thdec_production.schooldb.PolicyBitemporal;

/**
 * Service object for domain model class {@link PolicyBitemporal}.
 */
public interface PolicyBitemporalService {

    /**
     * Creates a new PolicyBitemporal. It does cascade insert for all the children in a single transaction.
     *
     * This method overrides the input field values using Server side or database managed properties defined on PolicyBitemporal if any.
     *
     * @param policyBitemporal Details of the PolicyBitemporal to be created; value cannot be null.
     * @return The newly created PolicyBitemporal.
     */
	PolicyBitemporal create(@Valid PolicyBitemporal policyBitemporal);


	/**
	 * Returns PolicyBitemporal by given id if exists.
	 *
	 * @param policybitemporalId The id of the PolicyBitemporal to get; value cannot be null.
	 * @return PolicyBitemporal associated with the given policybitemporalId.
     * @throws EntityNotFoundException If no PolicyBitemporal is found.
	 */
	PolicyBitemporal getById(Integer policybitemporalId) throws EntityNotFoundException;

    /**
	 * Find and return the PolicyBitemporal by given id if exists, returns null otherwise.
	 *
	 * @param policybitemporalId The id of the PolicyBitemporal to get; value cannot be null.
	 * @return PolicyBitemporal associated with the given policybitemporalId.
	 */
	PolicyBitemporal findById(Integer policybitemporalId);


	/**
	 * Updates the details of an existing PolicyBitemporal. It replaces all fields of the existing PolicyBitemporal with the given policyBitemporal.
	 *
     * This method overrides the input field values using Server side or database managed properties defined on PolicyBitemporal if any.
     *
	 * @param policyBitemporal The details of the PolicyBitemporal to be updated; value cannot be null.
	 * @return The updated PolicyBitemporal.
	 * @throws EntityNotFoundException if no PolicyBitemporal is found with given input.
	 */
	PolicyBitemporal update(@Valid PolicyBitemporal policyBitemporal) throws EntityNotFoundException;

    /**
	 * Deletes an existing PolicyBitemporal with the given id.
	 *
	 * @param policybitemporalId The id of the PolicyBitemporal to be deleted; value cannot be null.
	 * @return The deleted PolicyBitemporal.
	 * @throws EntityNotFoundException if no PolicyBitemporal found with the given id.
	 */
	PolicyBitemporal delete(Integer policybitemporalId) throws EntityNotFoundException;

	/**
	 * Find all PolicyBitemporals matching the given QueryFilter(s).
     * All the QueryFilter(s) are ANDed to filter the results.
     * This method returns Paginated results.
	 *
     * @deprecated Use {@link #findAll(String, Pageable)} instead.
	 *
     * @param queryFilters Array of queryFilters to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching PolicyBitemporals.
     *
     * @see QueryFilter
     * @see Pageable
     * @see Page
	 */
    @Deprecated
	Page<PolicyBitemporal> findAll(QueryFilter[] queryFilters, Pageable pageable);

    /**
	 * Find all PolicyBitemporals matching the given input query. This method returns Paginated results.
     * Note: Go through the documentation for <u>query</u> syntax.
	 *
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching PolicyBitemporals.
     *
     * @see Pageable
     * @see Page
	 */
    Page<PolicyBitemporal> findAll(String query, Pageable pageable);

    /**
	 * Find all PolicyBitemporals's history matching the given period clauses and query. This method returns
     * Paginated results.
     * Note: Go through the documentation for <u>periodClause</u> and <u>query</u> syntax.
	 *
     * @param systemClause The period clause condition.
     * @param applicationClause The period clause condition.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching PolicyBitemporals.
     *
     * @see Pageable
     * @see Page
	 */
    Page<PolicyBitemporal> findHistory(String systemClause, String applicationClause, String query, Pageable pageable);

    /**
	 * Find all PolicyBitemporals's history matching the given period clauses and query. This method returns
     * Paginated results.
     * Note: Go through the documentation for <u>periodClause</u> and <u>query</u> syntax.
	 *
     * @param periodClauses The clauses to filter history.
     * @param query The query to filter the results; No filters applied if the input is null/empty.
     * @param pageable Details of the pagination information along with the sorting options. If null returns all matching records.
     * @return Paginated list of matching PolicyBitemporals.
     *
     * @see Pageable
     * @see Page
	 */
    Page<PolicyBitemporal> findHistory(List<PeriodClause> periodClauses, String query, Pageable pageable);

    /**
	 * Exports all PolicyBitemporals matching the given input query to the given exportType format.
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
	 * Retrieve the count of the PolicyBitemporals in the repository with matching query.
     * Note: Go through the documentation for <u>query</u> syntax.
     *
     * @param query query to filter results. No filters applied if the input is null/empty.
	 * @return The count of the PolicyBitemporal.
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
