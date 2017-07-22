/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springlayers1.repository;

import com.mycompany.springlayers1.entity.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author SpringLayers
 */
@RepositoryRestResource(collectionResourceRel = "friend", path = "friend")
public interface FriendRepository extends CrudRepository<Friend, Integer> {
    
}
