FROM gradle:jdk8
RUN mkdir -p /app/
ADD . /app/
RUN cd /app && gradle build
ENTRYPOINT ["java", "-jar", "/app/build/libs/zuul-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 8762