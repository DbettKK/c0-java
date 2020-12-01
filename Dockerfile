# gradle 好大
# FROM maven:jdk14
# WORKDIR /app
# COPY pom.xml c0-java.iml /app/
# COPY src /app/src
# RUN mvn package
FROM openjdk:11
WORKDIR /app
COPY pom.xml c0-java.iml /app/
COPY src /app/src
RUN wget http://apache-mirror.rbc.ru/pub/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
RUN tar xzvf apache-maven-3.6.3-bin.tar.gz
RUN cp -R apache-maven-3.6.3 /usr/local/bin
RUN export PATH=apache-maven-3.6.3/bin:$PATH
RUN export PATH=/usr/local/bin/apache-maven-3.6.3/bin:$PATH
RUN ln -s /usr/local/bin/apache-maven-3.6.3/bin/mvn /usr/local/bin/mv
# RUN ls -l /usr/local/bin
# RUN echo $PATH
RUN mvn package
