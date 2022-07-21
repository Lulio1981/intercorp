# Productive image
FROM openjdk:11-jdk

RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get install tzdata

ENV TZ America/Lima
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN dpkg-reconfigure --frontend noninteractive tzdata
RUN cat /etc/timezone

WORKDIR /usr/src

COPY ["./target/app.jar", "/usr/src/"]
#COPY --from=builder ["/usr/src/target/app.jar", "/usr/src/"] ( ctrl + / to uncomment in intellij )

EXPOSE 80

CMD ["java","-jar", "/usr/src/app.jar"]