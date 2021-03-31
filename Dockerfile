FROM maven:3-jdk-13 as build
WORKDIR /usr/src/mymaven
COPY . .
RUN mvn clean install

FROM openjdk:13-oracle as base
VOLUME /tmp
EXPOSE 8000
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
COPY --from=build ./target/teablets-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]