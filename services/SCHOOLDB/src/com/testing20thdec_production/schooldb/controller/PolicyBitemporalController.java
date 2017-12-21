/*Copyright (c) 2017-2018 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.testing20thdec_production.schooldb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testing20thdec_production.schooldb.PolicyBitemporal;
import com.testing20thdec_production.schooldb.service.PolicyBitemporalService;


/**
 * Controller object for domain model class PolicyBitemporal.
 * @see PolicyBitemporal
 */
@RestController("SCHOOLDB.PolicyBitemporalController")
@Api(value = "PolicyBitemporalController", description = "Exposes APIs to work with PolicyBitemporal resource.")
@RequestMapping("/SCHOOLDB/PolicyBitemporal")
public class PolicyBitemporalController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyBitemporalController.class);

    @Autowired
	@Qualifier("SCHOOLDB.PolicyBitemporalService")
	private PolicyBitemporalService policyBitemporalService;

	@ApiOperation(value = "Creates a new PolicyBitemporal instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyBitemporal createPolicyBitemporal(@RequestBody PolicyBitemporal policyBitemporal) {
		LOGGER.debug("Create PolicyBitemporal with information: {}" , policyBitemporal);

		policyBitemporal = policyBitemporalService.create(policyBitemporal);
		LOGGER.debug("Created PolicyBitemporal with information: {}" , policyBitemporal);

	    return policyBitemporal;
	}

    @ApiOperation(value = "Returns the PolicyBitemporal instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyBitemporal getPolicyBitemporal(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting PolicyBitemporal with id: {}" , id);

        PolicyBitemporal foundPolicyBitemporal = policyBitemporalService.getById(id);
        LOGGER.debug("PolicyBitemporal details with id: {}" , foundPolicyBitemporal);

        return foundPolicyBitemporal;
    }

    @ApiOperation(value = "Updates the PolicyBitemporal instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyBitemporal editPolicyBitemporal(@PathVariable("id") Integer id, @RequestBody PolicyBitemporal policyBitemporal) throws EntityNotFoundException {
        LOGGER.debug("Editing PolicyBitemporal with id: {}" , policyBitemporal.getId());

        policyBitemporal.setId(id);
        policyBitemporal = policyBitemporalService.update(policyBitemporal);
        LOGGER.debug("PolicyBitemporal details with id: {}" , policyBitemporal);

        return policyBitemporal;
    }

    @ApiOperation(value = "Deletes the PolicyBitemporal instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deletePolicyBitemporal(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting PolicyBitemporal with id: {}" , id);

        PolicyBitemporal deletedPolicyBitemporal = policyBitemporalService.delete(id);

        return deletedPolicyBitemporal != null;
    }

    /**
     * @deprecated Use {@link #findPolicyBitemporals(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of PolicyBitemporal instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyBitemporal> searchPolicyBitemporalsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PolicyBitemporals list");
        return policyBitemporalService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PolicyBitemporal instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyBitemporal> findPolicyBitemporals(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyBitemporals list");
        return policyBitemporalService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PolicyBitemporal instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyBitemporal> filterPolicyBitemporals(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyBitemporals list");
        return policyBitemporalService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated history of PolicyBitemporal instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(value = "/history", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyBitemporal> findPolicyBitemporalsHistory(@ApiParam("system period clause to filter the history data.")@RequestParam(value = "systemClause", required = false) String systemClause, @ApiParam("application period clause to filter the history data.")@RequestParam(value = "applicationClause", required = false) String applicationClause, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyBitemporals history list");
        return policyBitemporalService.findHistory(systemClause, applicationClause, query, pageable);
    }

    @ApiOperation(value = "Returns the paginated history of PolicyBitemporal instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/history", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyBitemporal> filterPolicyBitemporalsHistory(@ApiParam("system period clause to filter the history data.")@RequestParam(value = "systemClause", required = false) String systemClause, @ApiParam("application period clause to filter the history data.")@RequestParam(value = "applicationClause", required = false) String applicationClause, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyBitemporals history list");
        return policyBitemporalService.findHistory(systemClause, applicationClause, query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportPolicyBitemporals(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return policyBitemporalService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of PolicyBitemporal instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countPolicyBitemporals( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting PolicyBitemporals");
		return policyBitemporalService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getPolicyBitemporalAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return policyBitemporalService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PolicyBitemporalService instance
	 */
	protected void setPolicyBitemporalService(PolicyBitemporalService service) {
		this.policyBitemporalService = service;
	}

}
