package com.sante.heart.repository;

import com.sante.heart.model.Diagnostic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticRepository extends CrudRepository<Diagnostic, Long> {

}
