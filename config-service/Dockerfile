FROM java:8-jre

ADD ./target/configuration-service-0.0.1-SNAPSHOT.jar /app/

# Remove --spring.profiles.active=native if using git config
ENTRYPOINT ["java", "-Xmx200m", \
    "-jar", "/app/configuration-service-0.0.1-SNAPSHOT.jar",\
    "--spring.profiles.active=native,docker"\
]
HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:8888/health || exit 1
EXPOSE 8888