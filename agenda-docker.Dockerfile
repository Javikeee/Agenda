FROM openjdk:19

COPY target/agenda-1.0.0.jar /agenda.jar

CMD ["java", "-jar", "/agenda.jar"]