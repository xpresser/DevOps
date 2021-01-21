# Start with a base image containing Java runtime
FROM fabric8/java-alpine-openjdk8-jre

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Create volume mount point 
VOLUME /tmp

# Spring Boot REST application's jar file
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar","-Djava.security.egd=file:/dev/./urandom"]

