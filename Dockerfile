FROM openjdk:11

WORKDIR /app
COPY target/*.jar /app/app.jar
#COPY dd-java-agent.jar /app/dd-java-agent.jar
RUN wget -O dd-java-agent.jar 'https://dtdg.co/latest-java-tracer'

EXPOSE 8080

ENTRYPOINT java -javaagent:/app/dd-java-agent.jar -jar /app/app.jar
