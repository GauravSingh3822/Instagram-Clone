# Build stage
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the jar file
COPY target/instagram-0.0.1-SNAPSHOT.jar /app/instagram.jar

EXPOSE 9092

ENTRYPOINT ["java", "-jar", "instagram.jar"]
CMD ["--spring.profiles.active=dev"]
