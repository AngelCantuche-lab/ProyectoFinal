FROM openjdk:latest

WORKDIR /clienteSer
COPY ./target/clienteSer-0.0.1-SNAPSHOT.jar /clienteSer

EXPOSE 8761

CMD ["java", "-jar", "clienteSer-0.0.1-SNAPSHOT.jar"]