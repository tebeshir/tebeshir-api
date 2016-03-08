package com.tebeshir.api.controller;

import com.tebeshir.api.persistence.model.Board;
import com.tebeshir.api.service.BoardService;
import com.tebeshir.api.util.TebeshirMappings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.util.List;

/**
 * Created by yeko on 31/12/15.
 */
@RestController
@RequestMapping(TebeshirMappings.BOARDS)
public class BoardController {

    @Autowired
    private BoardService boardService;

    // API

    // find - all/paginated

    /*
    @Override
    @RequestMapping(params = { QueryConstants.PAGE, QueryConstants.SIZE, QueryConstants.SORT_BY }, method = RequestMethod.GET)
    @ResponseBody
    public List<Board> findAllPaginatedAndSorted(@RequestParam(value = QueryConstants.PAGE) final int page, 
                                                 @RequestParam(value = QueryConstants.SIZE) final int size, 
                                                 @RequestParam(value = QueryConstants.SORT_BY) final String sortBy, 
                                                 @RequestParam(value = QueryConstants.SORT_ORDER) final String sortOrder) {
        return findPaginatedAndSortedInternal(page, size, sortBy, sortOrder);
    }

    @Override
    @RequestMapping(params = { QueryConstants.PAGE, QueryConstants.SIZE }, method = RequestMethod.GET)
    @ResponseBody
    public List<Board> findAllPaginated(@RequestParam(value = QueryConstants.PAGE) final int page, @RequestParam(value = QueryConstants.SIZE) final int size) {
        return findPaginatedAndSortedInternal(page, size, null, null);
    }

    @Override
    @RequestMapping(params = { QueryConstants.SORT_BY }, method = RequestMethod.GET)
    @ResponseBody
    public List<Board> findAllSorted(@RequestParam(value = QueryConstants.SORT_BY) final String sortBy, @RequestParam(value = QueryConstants.SORT_ORDER) final String sortOrder) {
        return findAllSortedInternal(sortBy, sortOrder);
    }
    */

    @RequestMapping(method = RequestMethod.GET)
    public List<Board> findAll() {
        return boardService.findAll();
    }

    // find - one

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Board findOne(@PathVariable("id") final Long id) {
        return boardService.findOneById(id);
    }

    // create

    /*
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid final Board resource) {
        createInternal(resource);
    }
    */

    // update

    /*
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") final Long id, @RequestBody @Valid final Board resource) {
        updateInternal(id, resource);
    }
    */

    // delete

    /*
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") final Long id) {
        deleteByIdInternal(id);
    }
    */

    // Spring

    /*
    @Override
    protected final IBoardService getService() {
        return service;
    }
    */

}