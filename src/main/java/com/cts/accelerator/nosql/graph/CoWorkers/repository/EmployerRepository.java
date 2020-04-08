package com.cts.accelerator.nosql.graph.CoWorkers.repository;

import com.arangodb.springframework.annotation.Query;
import com.arangodb.springframework.repository.ArangoRepository;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Employer;
import org.springframework.data.repository.query.Param;

public interface EmployerRepository extends ArangoRepository<Employer, String> {

    @Query("FOR c IN Employer FILTER c.name == @name RETURN c")
    Iterable<Employer> getWithName(@Param("name") String value);

}
