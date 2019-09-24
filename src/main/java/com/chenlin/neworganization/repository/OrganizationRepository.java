package com.chenlin.neworganization.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chenlin.neworganization.model.Organization;

/**
 * @author Chen Lin
 * @date 2019-08-31
 */

@Repository
public interface OrganizationRepository extends CrudRepository<Organization,String> {

	public Organization findOrganizationById(String organizationId);

}
