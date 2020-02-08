package com.back.thesis.database.Back.end.store.database.repository;

import com.back.thesis.database.Back.end.store.database.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
	
	Users findByUsernameAndPassword(String username,String password);
//
//	List<DAOUser> findAll();
//
//	DAOUser findAllById(long id);
//
//	DAOUser findAllById(int id);
//
	List<Users> findAllByRole(String role);
}