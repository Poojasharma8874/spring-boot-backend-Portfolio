# Step 1: Build stage - Maven se JAR banane ke liye
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# pom.xml aur source code copy karo
COPY pom.xml .
COPY src ./src

# Dependencies download karke jar build karo
RUN mvn clean package -DskipTests

# Step 2: Runtime stage - final image jisme app chalega
FROM eclipse-temurin:17-jdk
WORKDIR /app

# build stage se jar copy karo (replace jar name if different)
COPY --from=build /app/target/*.jar app.jar

# Port environment variable se lo (Render ke liye important)
ENV PORT=8080
EXPOSE 8080

# Spring Boot application start command
ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-jar", "app.jar"]
