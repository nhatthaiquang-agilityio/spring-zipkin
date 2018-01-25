FROM java:8-jre

ADD ./target/gateway-service-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-Xmx200m", \
    "-jar", "/app/gateway-service-0.0.1-SNAPSHOT.jar",\
    "--spring.profiles.active=docker"\
]
HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:8080/health || exit 1