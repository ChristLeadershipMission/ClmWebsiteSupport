FROM maven:3.8.5-openjdk-17 AS build
COPY pom.xml .
RUN mvn dependency:go-offline  # Downloads dependencies
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/ClmWebsiteSupport-0.0.1-SNAPSHOT.jar ClmWebsiteSupport-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "ClmWebsiteSupport-0.0.1-SNAPSHOT.jar"]