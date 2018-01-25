# Spring Cloud Zipkin Tracing
Examples of microservice instrastructures

This project contains several examples of microservice infrastructures implemented with Spring Boot and Spring Cloud projects. The aim of each project is to provide an end to end example, being able to deploy it without too much hassle.

### History
    - Config Server: use local or git
    - Integrate Eureka Service
    - Integrate Gateway Service
    - Apply docker-compose
    - Apply Zipki in docker-compose(Working)

### Overview
+ config-service:
    Load all configs for services via port 8888

+ eureka-service:
    Run service via port 8761

+ rating-service:
    Run service via port 5000

+ student-service:
    Run service via port 7000

+ zipkin-server:
    Run service via port 9411

+ zipkin-ui-server

+ gateway-service
    Run service via port 8090

Note: In the example, I don't use config-service but this is a good way.
Therefore, I keep it in the example. I hope I will apply it in the project.

### Zipkin UI
Check it out README.md in zipkin-ui-server

### Deployment
+ Deploy config-service
```
cd config-service
mvn spring-boot:run
```

+ Deploy eureka-service
```
cd eureka-service
mvn spring-boot:run
```

+ Deploy zipkin-server
```
cd zipkin-server
mvn spring-boot:run
```

+ Deploy rating-service
```
cd rating-service
mvn spring-boot:run
```

+ Deploy student-service
```
cd student-service
mvn spring-boot:run
```

### Run in Docker Compose
+ Deploy config-service
```
$ cd config-service
$ mvn clean package
$ docker build -t nhatthai/config-service:latest
```

+ Deploy eureka-service
```
$ cd eureka-service
$ mvn clean package
$ docker build -t nhatthai/eureka-service:latest
```

+ Deploy rating-service
```
$ cd rating-service
$ mvn clean package
$ docker build -t nhatthai/rating-service:latest
```

+ Deploy student-service
```
$ cd student-service
$ mvn clean package
$ docker build -t nhatthai/student-service:latest
```

+ Deploy gateway-service
```
$ cd gateway-service
$ mvn clean package
$ docker build -t nhatthai/gateway-service:latest
```

+ Deploy zipkin-server
```
$ cd zipkin-server
$ mvn clean package
$ docker build -t nhatthai/zipkin-server:latest
```

### Notes:
Run Zipkin UI
```
localhost:9412
```
![Zipkin UI](https://github.com/nhatthai/spring-zipkin/blob/master/images/zipkin-ui.png "Zipkin UI")


Notes: We can change port(9412)
Check README.md in zipkin-ui-server
```
-zipkin.web.port=:9412
```

![Eureka](https://github.com/nhatthai/spring-zipkin/blob/master/images/eureka-service.png "Eureka")

![Config-Service](https://github.com/nhatthai/spring-zipkin/blob/master/images/config-service.png "Config Service")

If you could not see all services in zipkin UI, please run http://localhost:5000 and http://localhost:7000 many times.
The zipkin web will reload all services.


#### Config Server
Run dockerfile, it will get config-repo on https://github.com/nhatthai/config-repo
```
--spring.profiles.active=docker"
```

Get config-repo in config-service/src/main/resources/shared
```
--spring.profiles.active=native,docker"
```

### Reference
[Microservice Zipkin Distributes Tracing](http://www.josedab.com/2016/03/09/microservices-zipkin-distributed-tracing/)

[Microservice Zipkin Distributes Tracing - GitHub](https://github.com/josedab/spring-cloud-examples/tree/master/zipkin-distributed-tracing)
