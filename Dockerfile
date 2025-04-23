# Use uma imagem base com Java 11
FROM openjdk:11-jdk

# Instale o Maven
RUN apt-get update && apt-get install -y maven

# Copie o código do seu projeto para dentro do container
COPY . /app

# Defina o diretório de trabalho
WORKDIR /app

# Execute o comando para compilar o projeto
RUN ./mvnw clean package

# Comando para iniciar o aplicativo
CMD ["java", "-jar", "target/PortifolioPeter-0.0.1-SNAPSHOT.jar"]
