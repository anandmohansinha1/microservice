FROM eclipse-temurin:17-jdk-alpine
#set working directory
# it means that all commands after this instruction will operate in the /app directory within the container, which becomes the current working directory.
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]