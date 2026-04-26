# Etapa 1: Construcción
FROM maven:3.8.6-openjdk-8 AS builder

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo pom.xml y descargar dependencias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar el código fuente
COPY src ./src

# Compilar el proyecto y ejecutar las pruebas
RUN mvn clean package

# Etapa 2: Ejecución
FROM eclipse-temurin:8-jre-alpine

WORKDIR /app

# Copiar el archivo JAR compilado desde la etapa de construcción
COPY --from=builder /app/target/GR06_1BP3_622_26A-1.0-SNAPSHOT.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
