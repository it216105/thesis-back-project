package com.back.thesis.database.Back.end.store.database.controller;

import com.back.thesis.database.Back.end.store.database.model.Thesis;
import com.back.thesis.database.Back.end.store.database.model.Users;
import com.back.thesis.database.Back.end.store.database.service.ApplicationService;
import com.back.thesis.database.Back.end.store.database.service.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secretary")
@CrossOrigin(origins = "http://localhost:4200")
public class Secretary {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Users> geteUser() throws Exception {
        return applicationService.getUserByRole("student");
    }

    @RequestMapping(value = "/activate/{id}", method = RequestMethod.POST)
    public Boolean activateUser(@PathVariable("id") long id) throws Exception {
        return applicationService.activateUser(id);
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Thesis saveThesis(@RequestBody Thesis thesis) throws Exception {
        return applicationService.createThesis(thesis);
    }
}
