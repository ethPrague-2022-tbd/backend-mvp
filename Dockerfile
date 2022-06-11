FROM gradle:7.4.2-jdk17
ADD . .
RUN gradle build shadowJar
ADD build/libs/backend.jar app.jar
EXPOSE 4567