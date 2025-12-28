FROM eclipse-temurin:21-jdk
WORKDIR /app
# Use the path relative to the root context
COPY user-service/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]