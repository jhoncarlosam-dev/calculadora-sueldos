FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copiar solo pom.xml primero para aprovechar la caché de Docker
COPY pom.xml .

# Descargar dependencias antes de copiar el código fuente
RUN mvn dependency:go-offline

# Ahora copia todo el código fuente
COPY . .

# Construir el JAR sin ejecutar pruebas
RUN mvn clean package -DskipTests

# Mover el JAR generado
RUN mv target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
