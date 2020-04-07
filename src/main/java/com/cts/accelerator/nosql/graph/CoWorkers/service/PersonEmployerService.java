package com.cts.accelerator.nosql.graph.CoWorkers.service;

import com.cts.accelerator.nosql.graph.CoWorkers.domain.Employer;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Person;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.PersonEmployer;
import com.cts.accelerator.nosql.graph.CoWorkers.repository.PersonEmpoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonEmployerService {

    @Autowired
    private PersonEmpoyerRepository personEmpoyerRepository;

    @Autowired
    private PersonService personService;

    @Autowired
    private EmployerService employerService;

    public PersonEmployer createPersonEmployer(String personId, String employerId) {
        Person person = personService.getPersonById(personId);
        Employer employer = employerService.getEmployerById(employerId);
        return personEmpoyerRepository.save(new PersonEmployer(person,employer));
    }

}
