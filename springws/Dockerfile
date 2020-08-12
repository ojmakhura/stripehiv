#### Stage 1: Build the application
FROM openjdk:8-jdk-alpine as build

# Set the current working directory inside the image
WORKDIR /app

# Copy maven executable to the image
#COPY mvnw .
COPY target/stripehiv-springws-1.0.jar .

ENTRYPOINT ["java","-jar","/app/stripehiv-springws-1.0.jar"]