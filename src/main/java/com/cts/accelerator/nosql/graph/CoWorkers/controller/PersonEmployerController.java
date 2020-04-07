package com.cts.accelerator.nosql.graph.CoWorkers.controller;

import com.cts.accelerator.nosql.graph.CoWorkers.domain.PersonEmployer;
import com.cts.accelerator.nosql.graph.CoWorkers.service.PersonEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "api/v1")
public class PersonEmployerController {

    @Autowired
    PersonEmployerService personEmployerService;

    @PostMapping("/personemployer/{personId}/{employerId}")
    public PersonEmployer createPersonEmployerController(@PathVariable("personId") String personId, @PathVariable("employerId") String  employerId) {
        return personEmployerService.createPersonEmployer(personId,employerId);
    }
}
