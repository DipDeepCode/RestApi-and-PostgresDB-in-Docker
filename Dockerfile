FROM openjdk:17-alpine
RUN mkdir -p /app
WORKDIR /app
ARG JAR_FILE=build/libs/\*.jar
COPY ${JAR_FILE} app/app.jar
EXPOSE 8080
ENV TZ Europe/Moscow
ENTRYPOINT ["java", "-Dspring.profiles.active=prod", "-jar", "/app.jar"]
