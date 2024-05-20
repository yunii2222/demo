# 버전
FROM openjdk:17
# 경로
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
# 구동시킨다.
ENTRYPOINT ["java", "-jar", "/app.jar"]