FROM openjdk:17-oracle
COPY ./target/eureka-service-registery-0.0.1-SNAPSHOT.jar eureka-service-registery.jar
CMD ["java","-jar","eureka-service-registery.jar"]
     