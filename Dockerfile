# Use uma imagem base com Java 11
FROM openjdk:11-jdk

# Defina JAVA_HOME
ENV JAVA_HOME /usr/local/openjdk-11
ENV PATH $JAVA_HOME/bin:$PATH

# Copie o código do seu projeto para dentro do container
COPY . /app

# Defina o diretório de trabalho
WORKDIR /app

# Execute o comando para compilar o projeto
RUN ./mvnw package

# Comando para iniciar o aplicativo
CMD ["java", "-jar", "target/PortifolioPeter-0.0.1-SNAPSHOT.jar"]
