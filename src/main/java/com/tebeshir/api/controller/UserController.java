package com.tebeshir.api.controller;

import com.tebeshir.api.persistence.model.User;
import com.tebeshir.api.service.UserService;
import com.tebeshir.api.util.TebeshirMappings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * Created by yeko on 05/01/16.
 */
@RestController
@RequestMapping(value = TebeshirMappings.USERS)
public class UserController {

    @Autowired
    private UserService userService;

    // API

    // find - all/paginated

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll(final HttpServletRequest request) {
        return userService.findAll();
    }

    // find - one

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public User findOne(@PathVariable("id") final Long id) {
        return userService.findOneById(id);
    }

    // create

    /*
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid final User resource) {
        userService.create
    }
    */

    // update

    /*
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") final Long id, @RequestBody @Valid final User resource) {
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

}