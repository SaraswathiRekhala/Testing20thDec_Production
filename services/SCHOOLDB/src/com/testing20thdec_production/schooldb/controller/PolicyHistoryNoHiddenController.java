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

import com.testing20thdec_production.schooldb.PolicyHistoryNoHidden;
import com.testing20thdec_production.schooldb.service.PolicyHistoryNoHiddenService;


/**
 * Controller object for domain model class PolicyHistoryNoHidden.
 * @see PolicyHistoryNoHidden
 */
@RestController("SCHOOLDB.PolicyHistoryNoHiddenController")
@Api(value = "PolicyHistoryNoHiddenController", description = "Exposes APIs to work with PolicyHistoryNoHidden resource.")
@RequestMapping("/SCHOOLDB/PolicyHistoryNoHidden")
public class PolicyHistoryNoHiddenController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyHistoryNoHiddenController.class);

    @Autowired
	@Qualifier("SCHOOLDB.PolicyHistoryNoHiddenService")
	private PolicyHistoryNoHiddenService policyHistoryNoHiddenService;

	@ApiOperation(value = "Creates a new PolicyHistoryNoHidden instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyHistoryNoHidden createPolicyHistoryNoHidden(@RequestBody PolicyHistoryNoHidden policyHistoryNoHidden) {
		LOGGER.debug("Create PolicyHistoryNoHidden with information: {}" , policyHistoryNoHidden);

		policyHistoryNoHidden = policyHistoryNoHiddenService.create(policyHistoryNoHidden);
		LOGGER.debug("Created PolicyHistoryNoHidden with information: {}" , policyHistoryNoHidden);

	    return policyHistoryNoHidden;
	}

    @ApiOperation(value = "Returns the PolicyHistoryNoHidden instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyHistoryNoHidden getPolicyHistoryNoHidden(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting PolicyHistoryNoHidden with id: {}" , id);

        PolicyHistoryNoHidden foundPolicyHistoryNoHidden = policyHistoryNoHiddenService.getById(id);
        LOGGER.debug("PolicyHistoryNoHidden details with id: {}" , foundPolicyHistoryNoHidden);

        return foundPolicyHistoryNoHidden;
    }

    @ApiOperation(value = "Updates the PolicyHistoryNoHidden instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public PolicyHistoryNoHidden editPolicyHistoryNoHidden(@PathVariable("id") Integer id, @RequestBody PolicyHistoryNoHidden policyHistoryNoHidden) throws EntityNotFoundException {
        LOGGER.debug("Editing PolicyHistoryNoHidden with id: {}" , policyHistoryNoHidden.getId());

        policyHistoryNoHidden.setId(id);
        policyHistoryNoHidden = policyHistoryNoHiddenService.update(policyHistoryNoHidden);
        LOGGER.debug("PolicyHistoryNoHidden details with id: {}" , policyHistoryNoHidden);

        return policyHistoryNoHidden;
    }

    @ApiOperation(value = "Deletes the PolicyHistoryNoHidden instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deletePolicyHistoryNoHidden(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting PolicyHistoryNoHidden with id: {}" , id);

        PolicyHistoryNoHidden deletedPolicyHistoryNoHidden = policyHistoryNoHiddenService.delete(id);

        return deletedPolicyHistoryNoHidden != null;
    }

    /**
     * @deprecated Use {@link #findPolicyHistoryNoHiddens(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of PolicyHistoryNoHidden instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyHistoryNoHidden> searchPolicyHistoryNoHiddensByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering PolicyHistoryNoHiddens list");
        return policyHistoryNoHiddenService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PolicyHistoryNoHidden instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyHistoryNoHidden> findPolicyHistoryNoHiddens(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyHistoryNoHiddens list");
        return policyHistoryNoHiddenService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of PolicyHistoryNoHidden instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<PolicyHistoryNoHidden> filterPolicyHistoryNoHiddens(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering PolicyHistoryNoHiddens list");
        return policyHistoryNoHiddenService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportPolicyHistoryNoHiddens(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return policyHistoryNoHiddenService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of PolicyHistoryNoHidden instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countPolicyHistoryNoHiddens( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting PolicyHistoryNoHiddens");
		return policyHistoryNoHiddenService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getPolicyHistoryNoHiddenAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return policyHistoryNoHiddenService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service PolicyHistoryNoHiddenService instance
	 */
	protected void setPolicyHistoryNoHiddenService(PolicyHistoryNoHiddenService service) {
		this.policyHistoryNoHiddenService = service;
	}

}
