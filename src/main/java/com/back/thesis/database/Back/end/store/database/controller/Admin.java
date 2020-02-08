package com.back.thesis.database.Back.end.store.database.controller;


import com.back.thesis.database.Back.end.store.database.model.Thesis;
import com.back.thesis.database.Back.end.store.database.model.Users;
import com.back.thesis.database.Back.end.store.database.service.ApplicationService;
import com.back.thesis.database.Back.end.store.database.service.ApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class Admin {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody Users user) throws Exception {
        return ResponseEntity.ok(applicationService.createUser(user));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable("id") long id) throws Exception {
        applicationService.deleteUser(id);
        return ResponseEntity.ok("deleted");
    }

    @RequestMapping(value = "/modify", method = RequestMethod.PUT)
    public ResponseEntity<?> modifyUser(@RequestBody Users user) throws Exception {
        return ResponseEntity.ok(applicationService.updateUser(user));
    }

    @RequestMapping(value = "/getusers", method = RequestMethod.GET)
    public List<Users> getUserList() throws Exception {
        return   applicationService.getAllUsers();
    }

    @RequestMapping(value = "/getuser/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Users getUserList(@PathVariable("id") long id) throws Exception {
        return   applicationService.getUserById(id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Users logIn(@RequestBody Users user) throws Exception {
        return   applicationService.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    @RequestMapping(value = "/registerThesis", method = RequestMethod.POST)
    @ResponseBody
    public Thesis logIn(@RequestBody Thesis thesis) throws Exception {
        return applicationService.createThesis(thesis);
    }


}