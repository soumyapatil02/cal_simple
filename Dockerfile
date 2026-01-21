FROM eclipse-temurin:17-jre
WORKDIR /app
COPY cal.jar cal.jar
CMD ["java", "-jar", "cal.jar"]
