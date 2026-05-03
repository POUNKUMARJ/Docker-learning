# Docker-learning

docker build -t my-springboot-app .
docker run -p 8080:8080 my-springboot-app
docker ps
docker logs <container_id>
copy target\programming-0.0.1-SNAPSHOT.jar app.jar


-------------------
save file dockerfile

# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from target/ folder to the container
COPY target/programming-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port (Spring Boot default is 8080)
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]


Command	Description
docker build -t myapp .	Builds a Docker image
docker run -p 80
80:8080 myapp	Runs a container
docker ps	Lists running containers
docker stop <container_id>	Stops a container
docker images	Lists all Docker images
docker rmi <image_id>	Removes a Docker image




docker build -t docker:vq .


docker run -p 8080:8080 docker:vq


Here:

First 8080 → your system (host)
Second 8080 → inside container (Spring Boot app)



docker run -d -p 8080:8080 --name firstContainer docker:v1


docker start firstContainer



docker rm -f firstContainer
docker run -d -p 8080:8080 --name firstContainer docker:v1
------------------------


version: "3.8"
services:
  myapp:
    image: myapp
    container_name: myapp-container
    ports:
      - "8080:8080"
    environment:
      - SPRING_PROFILES_ACTIVE=prod
      - EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eureka-server:8761/eureka/
    depends_on:
      - eureka-server
  eureka-server:
    image: eureka-server
    ports:
      - "8761:8761"

----------------------------------


