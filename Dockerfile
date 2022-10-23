FROM openjdk:17-alpine
COPY build/libs/restapivdsdocker-0.0.1-SNAPSHOT-plain.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
