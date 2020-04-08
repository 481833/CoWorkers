package com.cts.accelerator.nosql.graph.CoWorkers.controller;

import com.arangodb.springframework.annotation.Query;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Employer;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Person;
import com.cts.accelerator.nosql.graph.CoWorkers.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public List<Person>  getAllPersons() {
        return personService.getAllPersons();
    }

    @PostMapping("/persons")
    public Person createPerson(@Valid @RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping("/persons/{personName}/employers")
    public List<Employer> getPersonEmployers(@PathVariable String personName) {
        return personService.getPersonEmployers(personName);
    }

    @GetMapping("/persons/{personId}")
    public List<Person> getAllChildsAndGrandchilds(@PathVariable String personId) {
        return personService.getAllChildsAndGrandchilds(personId);
    }


}
