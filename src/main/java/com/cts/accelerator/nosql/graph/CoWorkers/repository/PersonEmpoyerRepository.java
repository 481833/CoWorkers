package com.cts.accelerator.nosql.graph.CoWorkers.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.PersonEmployer;

public interface PersonEmpoyerRepository extends ArangoRepository<PersonEmployer, String> {

}
