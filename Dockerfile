FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/springboot-aws-deploy.jar springboot-aws-deploy.jar
ENTRYPOINT ["java","-jar","/springboot-aws-deploy.jar"]