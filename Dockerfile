FROM azul/zulu-openjdk-alpine:21-jre-headless-latest

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
