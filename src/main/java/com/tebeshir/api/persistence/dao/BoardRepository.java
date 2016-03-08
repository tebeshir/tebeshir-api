package com.tebeshir.api.persistence.dao;

import com.tebeshir.api.persistence.model.Board;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yeko on 29/12/15.
 */
@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {

    Board findOneByName(String name);

    Board findOneById(Long id);
}