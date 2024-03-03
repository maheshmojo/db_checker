FROM openjdk:17-alpine
RUN apk update
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
USER appuser
ADD build/libs/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demo.jar"," --server.port=8080"]
