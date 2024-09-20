FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} tipo-de-cambio-webflux.jar
ENTRYPOINT ["java", "-jar", "/tipo-de-cambio-webflux.jar"]