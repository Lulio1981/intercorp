# Build the project jar files
FROM maven:3.8.5-jdk-11 as builder

MAINTAINER Lulio Herrera (https://github.com/Lulio1981)

WORKDIR /usr/src

COPY ["./pom.xml", "/usr/src/pom.xml"]

RUN mvn dependency:go-offline -B

COPY [".", "/usr/src/"]

RUN mvn package

CMD ["mvn","--version"]



# Productive image
FROM openjdk:11-jdk

RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install tzdata

ENV TZ America/Lima
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN dpkg-reconfigure --frontend noninteractive tzdata
RUN cat /etc/timezone

WORKDIR /usr/src

COPY --from=builder ["/usr/src/target/app.jar", "/usr/src/"]

EXPOSE 8089

CMD ["java","-jar", "/usr/src/app.jar"]