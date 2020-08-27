# Cucumber Salad

Simple implementation of a Spring Boot application that serves an API and automated tests with Cucumber, JUnit and Mockito.

## System Requirements

* JDK 11
* Apache Maven

## Unit and Integration Tests

To execute all unit tests, run:

```
mvn clean test
```

To execute all tests (unit and integration), run:

```
mvn clean integration-test
```

## Runtime

To execute the application, run:

```
mvn spring-boot:run
```

## Calling the API

After you start up the application, you can call the REST API.

On the command line, use "curl":

```
curl -s http://localhost:8080/api/salad

curl -s http://localhost:8080/api/salad?name=Dan

curl -s --data "Marcelo" http://localhost:8080/api/salad
```

You can either use Postman or even your web browser to call the API.
