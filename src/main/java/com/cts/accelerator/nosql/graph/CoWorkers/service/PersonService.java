package com.cts.accelerator.nosql.graph.CoWorkers.service;

import com.cts.accelerator.nosql.graph.CoWorkers.RecordNotFoundException;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Employer;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Person;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.PersonEmployer;
import com.cts.accelerator.nosql.graph.CoWorkers.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons() {
        return StreamSupport
                .stream(personRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    // after we add `@Relations(edges = Employer.class, lazy = true) Collection<Person> employers;` in Person
    // we can now load all employers of a person when we fetch the person
    public List<Employer> getPersonEmployers(String personName) {
        return personRepository.findByName(personName)
                .map(person -> {
                     return person.getEmployers().stream().collect(Collectors.toCollection(ArrayList::new));
                }).orElseThrow(() -> new RecordNotFoundException("Person not found with id " + personName));
    }

    public Person getPersonById(String personId) {
        return  personRepository
                .findById(personId)
                .orElseThrow(() -> new RecordNotFoundException("Customer not found on :: " + personId));
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public List<Person> getAllChildsAndGrandchilds(String personId) {
        Person person = this.getPersonById(personId);
        Set<Person> persons = personRepository.getAllChildsAndGrandchilds("Person/" + personId, PersonEmployer.class);
        return persons.stream().collect(Collectors.toList());
    }
}
