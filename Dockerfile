FROM openjdk:8
COPY /target/deven-docker.jar app.jar

ENTRYPOINT ["java","-jar", "app.jar"]