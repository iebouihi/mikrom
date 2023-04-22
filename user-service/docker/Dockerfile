FROM eclipse-temurin:17.0.6_10-jdk-alpine
WORKDIR /user/app
COPY $../build/libs/*.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/app.jar"]