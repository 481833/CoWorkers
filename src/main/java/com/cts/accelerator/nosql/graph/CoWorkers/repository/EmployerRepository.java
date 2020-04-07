package com.cts.accelerator.nosql.graph.CoWorkers.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Employer;

public interface EmployerRepository extends ArangoRepository<Employer, String> {
}
