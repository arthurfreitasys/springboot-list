# Estágio 1: Build da aplicação com Maven e OpenJDK 21
FROM maven:3.9.6-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .

# Baixa dependências para cache
RUN mvn dependency:go-offline -B

COPY src ./src

# Compila e gera o arquivo JAR
RUN mvn clean package -DskipTests

# Estágio 2: Imagem de execução com JRE 21
FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

# Configuração da porta dinâmica
ENV PORT=8080
EXPOSE 8080

# Inicialização da aplicação
ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=${PORT}"]