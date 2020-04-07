package com.cts.accelerator.nosql.graph.CoWorkers.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Person;

import java.util.Optional;

public interface PersonRepository extends ArangoRepository<Person, String> {

    Optional<Person> findByName(String name);
}
