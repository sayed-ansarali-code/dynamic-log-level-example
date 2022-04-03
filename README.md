
# Getting Started

* Simple SpringBoot Application
* Exposes and endpoint `/log` that prints all five levels of logging available logging framework.
* Configs added in application.properties to expose actuator endpoint using which log level can be changed.
* logback-spring.xml (with scan enabled in it) added in src/resources folder to test dynamic log level change.

### Steps - Changing log level dynamically through actuator endpoint 

* Access log API: `curl http://localhost:8083/log`
* Check console of running spring boot application. There must be 3 logs for levels INFO, WARN, ERROR
* Check log level for our package (must be INFO): `curl http://localhost:8083/actuator/loggers/dynamic.log.level.example.controller`
* Change log level to TRACE: `curl -i -X POST -H "Content-Type: application/json" http://localhost:8083/actuator/loggers/dynamic.log.level.example.controller  -d "{\"configuredLevel\": \"TRACE\"}"`
* Access log API again: `curl http://localhost:8083/log`
* Check console of running spring boot application. This time, there must be 5 logs for levels TRACE, DEBUG, INFO, WARN, ERROR

### Steps - Changing log level dynamically through external logback-spring.xml

* Start SpringBoot Application using below command
* maven build the project and cd into target directory.
* Command: `java -jar .\dynamic-log-level-example-0.0.1-SNAPSHOT.jar --logging.config=<path-to-logback-spring.xml>`
* Access log API: `curl http://localhost:8083/log`
* Check console of running SpringBoot Application. There must be 3 logs for levels INFO, WARN, ERROR
* Edit logback-spring.xml (line number 9) and update the log level to TRACE.
* Access log API again: `curl http://localhost:8083/log`
* Check console of running spring boot application. This time, there must be 5 logs for levels TRACE, DEBUG, INFO, WARN, ERROR

