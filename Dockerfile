FROM openjdk:11
COPY target/crud.poc-0.0.1-SNAPSHOT.jar /poc.jar
CMD ["java", "-jar", "/poc.jar"]
EXPOSE 9020