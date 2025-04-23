FROM openjdk:17-jdk

RUN apt-get update
RUN apt-get install openjdk:17-jdk -y
COPY . .

RUN apt-get install -y maven
RUN mvn clean install 

EXPOSE 8080

COPY --from=build /target/PortifolioPeter-0.0.1-SNAPSHOT.jar

# Comando para iniciar o aplicativo
CMD ["java", "-jar", "target/PortifolioPeter-0.0.1-SNAPSHOT.jar"]
