FROM openjdk:8
EXPOSE 8080
ADD target/docker-demo-project.jar docker-demo-project.jar
ENTRYPOINT ["java","-jar","docker-demo-project.jar"]