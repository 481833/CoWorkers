package com.cts.accelerator.nosql.graph.CoWorkers.service;

import com.cts.accelerator.nosql.graph.CoWorkers.RecordNotFoundException;
import com.cts.accelerator.nosql.graph.CoWorkers.domain.Employer;
import com.cts.accelerator.nosql.graph.CoWorkers.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployerService {

    @Autowired
    EmployerRepository employerRepository;

    public List<Employer> getAllEmployers() {
        return StreamSupport
                .stream(employerRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Employer getEmployerById(String employerId) {
        return  employerRepository
                .findById(employerId)
                .orElseThrow(() -> new RecordNotFoundException("Employer not found on :: " + employerId));
    }

    public Employer createEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

}
