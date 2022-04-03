# Read Me First
The following was discovered as part of building this project:

* The original package name 'dynamic-log-level-example' is invalid and this project uses 'dynamicloglevelexample' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#using-boot-devtools)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#production-ready)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Steps

* Access log API: curl http://localhost:8083/log
* Check console of running spring boot application. There must be 3 logs for levels INFO, WARN, ERROR
* Check log level for our package: curl http://localhost:8083/actuator/loggers/dynamic.log.level.example.controller
* Change log level to TRACE: curl -i -X POST -H "Content-Type: application/json" http://localhost:8083/actuator/loggers/dynamic.log.level.example.controller  -d "{\"configuredLevel\": \"TRACE\"}"
* Access log API: curl http://localhost:8083/log
* Check console of running spring boot application. There must be 5 logs for levels TRACE, DEBUG, INFO, WARN, ERROR
