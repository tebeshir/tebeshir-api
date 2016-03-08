package com.tebeshir.api.service;

import com.tebeshir.api.persistence.model.Board;
import com.tebeshir.api.persistence.dao.BoardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yeko on 04/01/16.
 */
@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> findAll() {
        return (List<Board>) boardRepository.findAll();
    }

    public Board findOneById(Long id) {
        return boardRepository.findOneById(id);
    }
}