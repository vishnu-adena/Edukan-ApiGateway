# Step 1: Build the application
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Step 2: Create a minimal distroless image for running the application
FROM gcr.io/distroless/java21
EXPOSE 8762
COPY --from=build /app/target/API-GATEWAY-0.0.1.jar /app/apiGateway.jar
ENTRYPOINT ["java", "-jar", "/app/apiGateway.jar"]
