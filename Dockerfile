FROM eclipse-temurin:17-jdk-alpine
COPY target/openapi-deployrestservice-1.0.0-SNAPSHOT.jar /opt/lib/openapi-deployrestservice-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java"]
CMD ["-jar", "/opt/lib/openapi-deployrestservice-1.0.0-SNAPSHOT.jar"]
EXPOSE 8080