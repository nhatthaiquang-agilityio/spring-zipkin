FROM java:8-jre

ADD ./target/zipkin-server-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-Xmx200m", \
    "-jar", "/app/zipkin-server-0.0.1-SNAPSHOT.jar",\
    "--spring.profiles.active=docker"\
]
HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:9411/health || exit 1
EXPOSE 9411