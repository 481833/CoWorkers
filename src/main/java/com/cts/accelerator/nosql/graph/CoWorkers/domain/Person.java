package com.cts.accelerator.nosql.graph.CoWorkers.domain;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.Relations;
import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.Date;

@Document("Person")
public class Person {
    @Id
    private String id;

    private String name;
    private Date doj;
    private String title;

    @Relations(edges = PersonEmployer.class, lazy = true)
    private Collection<Employer> employers;

    public Person() {
        super();
    }

    public Person(String name, Date doj, String title) {
        super();
        this.name = name;
        this.doj = doj;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<Employer> getEmployers() {
        return employers;
    }

    public void setChilds(Collection<Employer> employers) {
        this.employers = employers;
    }

}
