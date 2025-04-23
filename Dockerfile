# Use uma imagem base com Java 11
FROM openjdk:11-jdk

ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV PATH=$JAVA_HOME/bin:$PATH

# Instale o Maven
RUN apt-get update && apt-get install -y maven

# Copie o código do seu projeto para dentro do container
COPY . /app

# Defina o diretório de trabalho
WORKDIR /app

# Execute o comando para compilar o projeto
RUN mvn clean package -X

# Comando para iniciar o aplicativo
CMD ["java", "-jar", "target/PortifolioPeter-0.0.1-SNAPSHOT.jar"]
