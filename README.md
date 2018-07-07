# spring-boot-rest-api

A sample project that implements Restful APIs with [Spring Boot](https://spring.io/projects/spring-boot)

#### Libraries

Following libraries are used in the project.

* Build Tool
  - [Gradle](https://gradle.org/)
* JAX-RS
  * [Jersey](https://jersey.github.io/)（spring-boot-starter-jersey）
* Aspect Oriented Programming
  * [Spring AOP](https://docs.spring.io/spring/docs/2.5.x/reference/aop.html) (AspectJ annotations)
* Connection Pooling
  * [HikariCP](https://github.com/brettwooldridge/HikariCP)
* Database Access
  * [Spring Data JPA](https://projects.spring.io/spring-data-jpa/)（spring-boot-starter-data-jpa）
* Transaction Management
  * [Transaction Management Feature of Spring Framework](https://docs.spring.io/spring/docs/4.2.x/spring-framework-reference/html/transaction.html)
* Code Generation Library
  * [Lombok](https://projectlombok.org/)
* Configuration
  * [spring-boot-configuration-processor](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html)
* Logging
  * [SLF4J](https://www.slf4j.org/) + [Logback](http://logback.qos.ch/)
* Testing
  * [spring-boot-test](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html)

#### How to run APIs in Eclipse IDE

* Prepare DBMS (MySQL) and schema.
  * Install MySQL server on your machine.
  * Run `/sql/create.sql` to create a DB schema.
  * Modify `/src/main/resources/application.yaml` with your MySQL connection information.
* Install [Spring Tool Suite](https://spring.io/tools/sts) on Eclipse IDE.
* Import the project into Eclipse IDE.
  * `File` => `Importr` => `Exisiting Projects to Workspace`

* Right click on `Application.java`  => `Run` => `Spring Boot Application`

#### API Requests and Responses

APIs for CRUD operations of ToDo resource are implemented.

```shell
# Create a ToDo item.
$ curl --request POST \
>  --url http://localhost:8080/example/api/todos \
>  --header 'Content-Type: application/json' \
>  --data '{"title":"Test","content":"This is a test.","date": "2018-06-01"}' \
>  --include

HTTP/1.1 200
Content-Type: application/json
Content-Length: 71

{"id":1,"title":"Test","content":"This is a test.","date":"2018-06-01"}
```



