FROM eclipse-temurin:17-jdk-alpine
#set working directory
# it means that all commands after this instruction will operate in the /app directory within the container, which becomes the current working directory.
RUN apk add --no-cache curl
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8888
ENTRYPOINT ["java","-XX:MaxRAMPercentage=75.0", "-jar", "app.jar"]