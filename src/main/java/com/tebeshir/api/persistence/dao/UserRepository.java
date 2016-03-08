package com.tebeshir.api.persistence.dao;

import com.tebeshir.api.persistence.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yeko on 04/01/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOneByName(String name);

    User findOneById(Long id);

}