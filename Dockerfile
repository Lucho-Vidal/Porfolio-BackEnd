FROM amazoncorretto:11-alpine-jdk
MAINTAINER luvidev
COPY target/luvidev-0.0.1-SNAPSHOT.jar  luvidev-app.jar
ENTRYPOINT ["java","-jar","/luvidev-app.jar"]