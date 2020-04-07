package com.cts.accelerator.nosql.graph.CoWorkers.domain;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;
import org.springframework.data.annotation.Id;

@Edge("personemployer")
public class PersonEmployer {

    @Id
    private String id;

    @From
    private Person person;

    @To
    private Employer employer;

    public PersonEmployer(Person person, Employer employer) {
        this.person = person;
        this.employer = employer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    @Override
    public String toString() {
        return "Relationship [id=" + id + ", employer=" + employer + ", person=" + person + "]";
    }

}
