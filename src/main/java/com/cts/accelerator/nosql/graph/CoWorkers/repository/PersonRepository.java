package com.cts.accelerator.nosql.graph.CoWorkers.repository;

import com.arangodb.springframework.annotation.Query;
import com.arangodb.springframework.repository.ArangoRepository;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Person;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;

public interface PersonRepository extends ArangoRepository<Person, String> {

    Optional<Person> findByName(String name);

    @Query("FOR v IN 1..2 INBOUND @id @@edgeCol SORT v.age DESC RETURN DISTINCT v")
    Set<Person> getAllChildsAndGrandchilds(@Param("id") String id, @Param("@edgeCol") Class<?> edgeCollection);
}
