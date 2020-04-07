package com.cts.accelerator.nosql.graph.CoWorkers.controller;

import com.cts.accelerator.nosql.graph.CoWorkers.domain.Employer;
import com.cts.accelerator.nosql.graph.CoWorkers.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class EmployerController {

    @Autowired
    EmployerService employerService;

    @GetMapping("/employers")
    public List<Employer> getAllEmployers() {
        return employerService.getAllEmployers();
    }

    @PostMapping("/employers")
    public Employer createEmployer(@Valid @RequestBody Employer employer) {
        return employerService.createEmployer(employer);
    }
}
