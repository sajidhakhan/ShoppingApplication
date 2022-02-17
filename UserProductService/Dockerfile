FROM openjdk:11-jre-slim
WORKDIR usr/lib
EXPOSE 8089
ENV MONGO_DATABASE=product
ADD ./target/UserProductService-0.0.1-SNAPSHOT.jar-0.0.1-SNAPSHOT.jar /usr/lib/UserProductService-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","UserProductService-0.0.1-SNAPSHOT.jar"]