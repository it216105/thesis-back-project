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
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class User {

    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/register/{idUser}/{idThesis}", method = RequestMethod.GET)
    public Thesis chooseThesis(@PathVariable("idUser") long idUser, @PathVariable("idThesis") long idThesis) throws Exception {
        return applicationService.chooseThesis(idUser,idThesis);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Thesis> getThesis() throws Exception {
        return applicationService.getThesisIsActive();
    }

}
