# NoSQL Graph Demo with Spring Boot, ArangoDB, JPA, REST API


## Steps to Setup

**1. Clone the repository**

```bash
git clone https://github.com/481833/CoWorkers.git
```

**2. Configure ArangoDB**

First, create a database named `coworkersdb`. Then, open `src/main/resources/application.properties` file and change the spring datasource username and password as per your ArangoDB installation.

**3. Run the app**

Type the following command from the root directory of the project to run it -

```bash
mvn spring-boot:run
```

Alternatively, you can package the application in the form of a JAR file and then run it like so -

```bash
mvn clean package
java -jar target/CoWorkers-0.0.1-SNAPSHOT.jar
```

**4. Test method**

```bash
Data creation sequence as below

a. Create Person
b. Create Employer
c. Create Person Employer Relationship

Use APIs listed below to create and query data. 
```

**5. API access**

Get all Persons

```bash
http://localhost:8090/api/v1/persons
```

Get all Employers for a Person

```bash
http://localhost:8090/api/v1//persons/{personName}/employers
```

Create Person(Request Body(Json) : Person)

```bash
http://localhost:8090/api/v1/persons
```

Get all Employers

```bash
http://localhost:8090/api/v1/employers
```

create Employer(Request Body(Json) : Employer)

```bash
http://localhost:8090/api/v1/employers
```

Create Person to Employer RelationShip (Edge)

```bash
http://localhost:8090/api/v1/personemployer/{personId}/{employerId}
```
