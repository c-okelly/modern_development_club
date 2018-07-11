FROM openjdk:8u171-slim

COPY rest-service/ app/
WORKDIR app/
RUN ./gradlew build

CMD ["./gradlew", "bootRun"]