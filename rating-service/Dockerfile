FROM java:8-jre

ADD ./target/rating-service-1.0.0.RELEASE.jar /app/

ENTRYPOINT ["java", "-Xmx200m", \
    "-jar", "/app/rating-service-1.0.0.RELEASE.jar",\
    "--spring.profiles.active=docker"\
]
HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:5000/health || exit 1
EXPOSE 5000