package com.cts.accelerator.nosql.graph.CoWorkers.domain;


import com.arangodb.springframework.annotation.Document;
import org.springframework.data.annotation.Id;


@Document("Employer")
public class Employer {

   @Id
   private String id;
   private String name;
   private String location;

   public Employer() {
      super();
   }

   public Employer(String name, String location) {
      super();
      this.name = name;
      this.location = location;
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

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }
}
