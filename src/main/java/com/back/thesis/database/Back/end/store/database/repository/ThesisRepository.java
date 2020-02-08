package com.back.thesis.database.Back.end.store.database.repository;

import com.back.thesis.database.Back.end.store.database.model.Thesis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThesisRepository extends CrudRepository<Thesis, Long> {

}