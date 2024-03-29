package com.chenlin.neworganization.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.chenlin.neworganization.model.Organization;
import com.chenlin.neworganization.service.OrganizationService;

/**
 * @author Chen Lin
 * @date 2019-08-31
 */

@RestController
@RequestMapping(value = "v1/organizations")
public class OrganizationServiceController {

	@Autowired
	private OrganizationService orgService;

	@RequestMapping(value = "/{organizationId}", method = RequestMethod.GET)
	public Organization getOrganization(@PathVariable("organizationId") String organizationId) {
		Organization org = orgService.getOrg(organizationId);
		org.setContactName("new::"+org.getContactName());
		org.setName("new::"+org.getName());
		return org;
	}
	
	@RequestMapping(value = "/{organizationId}", method = RequestMethod.PUT)
	public void updateOrganization(@PathVariable("organizationId") String organizationId, @RequestBody Organization org) {
		orgService.updateOrg(org);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void saveOrganization(@RequestBody Organization org) {
		orgService.saveOrg(org);
	}
	
	@RequestMapping(value = "/{organizationId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteOrganization(@RequestBody Organization org) {
		orgService.deleteOrg(org);
	}
	
}
