package com.sante.heart.repository;

import com.sante.heart.model.Symptom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomRepository extends CrudRepository<Symptom, Long> {

}
