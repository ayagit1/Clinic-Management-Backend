package com.sante.heart.repository;

import com.sante.heart.model.TestResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<TestResult, Long> {

}
