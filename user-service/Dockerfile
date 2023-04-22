FROM eclipse-temurin:17.0.6_10-jdk-alpine
WORKDIR /user/app
COPY build/libs/*.jar server.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","/user/app/server.jar"]
