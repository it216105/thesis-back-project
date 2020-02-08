package com.back.thesis.database.Back.end.store.database.service;

import com.back.thesis.database.Back.end.store.database.model.Thesis;
import com.back.thesis.database.Back.end.store.database.model.Users;

import java.util.List;

public interface ApplicationService {

    Users createUser(Users user);

    Users updateUser(Users user);

    List<Users> getAllUsers();

    Users getUserById(long userId);

    List<Users> getUserByRole(String role);

    Users findByUsernameAndPassword(String username,String password);

    void deleteUser(long id);

    Boolean activateUser(long id);

    Thesis createThesis(Thesis thesis);

    List<Thesis> getThesis();

    List<Thesis> getThesisIsActive();

    Thesis chooseThesis(long idUser,long idThesis);


}
