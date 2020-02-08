package com.back.thesis.database.Back.end.store.database.service;


import com.back.thesis.database.Back.end.store.database.config.ResourceNotFoundException;
import com.back.thesis.database.Back.end.store.database.model.Thesis;
import com.back.thesis.database.Back.end.store.database.model.Users;
import com.back.thesis.database.Back.end.store.database.repository.ThesisRepository;
import com.back.thesis.database.Back.end.store.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ThesisRepository thesisRepository;

    @Override
    public Users createUser(Users user) {
        user.setActivate(false);
        return userRepository.save(user);
    }

    @Override
    public Users updateUser(Users user) {
        Optional<Users> userDb = this.userRepository.findById(user.getId());
        System.out.println(userDb.toString());
        if (userDb.isPresent()) {
            Users usertUpdate = userDb.get();
            usertUpdate.setId(user.getId());
            System.out.println(user.toString());
            userRepository.save(usertUpdate);
            return usertUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + user.getId());
        }
    }

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) this.userRepository.findAll();
    }

    @Override
    public Users getUserById(long userId) {
        Optional <Users> userDb = this.userRepository.findById(userId);

        if (userDb.isPresent()) {
            return userDb.get();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + userId);
        }
    }

    @Override
    public List<Users> getUserByRole(String role) {
        List<Users> userDb = this.userRepository.findAllByRole(role);

        if (!userDb.isEmpty()) {
            return userDb;
        } else {
            throw new ResourceNotFoundException("Record not found with role : " + role);
        }
    }

    @Override
    public void deleteUser(long id) {
        Optional <Users> userDb = this.userRepository.findById(id);

        if (userDb.isPresent()) {
            this.userRepository.delete(userDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }

    }

    public Boolean activateUser(long id){
        Optional <Users> userDb = this.userRepository.findById(id);

        if (userDb.isPresent()) {
            if(userDb.get().isActivate()){
                userDb.get().setActivate(false);
            }else{
                if((Integer.valueOf(userDb.get().getOwesLessons()) < 2) && (Integer.valueOf(userDb.get().getYearOfStudies()) >= 4))
                userDb.get().setActivate(true);
            }
            this.userRepository.save(userDb.get());
            return userDb.get().isActivate();
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + id);
        }
    }

    public Users findByUsernameAndPassword(String username,String password){
        Users userDb = this.userRepository.findByUsernameAndPassword(username,password);

        if (userDb != null) {
            return userDb;
        } else {
            throw new ResourceNotFoundException("Record not found with username : " + username);
        }

    }

    @Override
    public Thesis createThesis(Thesis thesis) {
        return thesisRepository.save(thesis);
    }

    @Override
    public List<Thesis> getThesis() {
        return (List<Thesis>) this.thesisRepository.findAll();
    }

    public List<Thesis> getThesisIsActive() {
        List<Thesis> thesis = (List<Thesis>) this.thesisRepository.findAll();
        System.out.println(thesis);
        for(Thesis th: thesis){
            if((th.getFirstName() != null) && !(th.getFirstName().equals(" "))) {
                thesis.remove(th.getId());
            }
        }
        return thesis;
    }
    @Override
    public Thesis chooseThesis(long idUser, long idThesis) {

        Optional <Thesis> thesisDb = this.thesisRepository.findById(idThesis);
        Optional <Users> userDb = this.userRepository.findById(idUser);

        if (thesisDb.isPresent() && thesisDb.get().getLastName() == null) {
            Thesis thesisUpdate = thesisDb.get();
            thesisUpdate.setFirstName(userDb.get().getFirstName());
            thesisUpdate.setLastName(userDb.get().getLastName());
            thesisRepository.save(thesisUpdate);
            userDb.get().setActivate(false);
            userRepository.save(userDb.get());
            return thesisUpdate;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + idUser);
        }
    }


}
