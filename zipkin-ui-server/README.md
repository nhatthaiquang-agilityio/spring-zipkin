# Spring Zipkin Web
The incorporation of the Zipkin stream server will allow us to receive http traces that later can be shown through the Zipkin Web UI

Tracing rating-service and student-service

### Deployment Zipkin UI
```
$ cd zipkin-ui-server
$ java -jar lib/zipkin-web-all.jar -zipkin.web.port=:9412 -zipkin.web.rootUrl=/ -zipkin.web.query.dest=localhost:9411
```
