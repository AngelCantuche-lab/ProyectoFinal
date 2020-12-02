FROM openjdk:latest

WORKDIR /facturaSer
COPY ./target/facturaSer-0.0.1-SNAPSHOT.jar /factura-service

EXPOSE 8761

CMD ["java", "-jar", "facturaSer-0.0.1-SNAPSHOT.jar"]