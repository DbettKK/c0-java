FROM openjdk:11
WORKDIR /app
COPY c0-java.jar /app
RUN java -jar c0-java.jar $input $asm

