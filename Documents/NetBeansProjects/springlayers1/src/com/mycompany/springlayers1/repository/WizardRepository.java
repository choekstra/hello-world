/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.repository;

import com.mycompany.springlayers1.entity.Wizard;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author SpringLayers
 */
@RepositoryRestResource(collectionResourceRel = "wizard", path = "wizard")
public interface WizardRepository extends PagingAndSortingRepository<Wizard, Integer> {
    
	// This is a custom query: 
    List<Wizard> findByLastname(@Param("lastname") String name);
}
