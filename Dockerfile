FROM openjdk:17

WORKDIR /app

COPY target/demoapp123.jar app.jar

EXPOSE 55555

ENTRYPOINT ["java", "-jar", "app.jar"]