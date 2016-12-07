FROM openjdk:8-jdk

ADD mvn /mvn

ENV JAVA_OPTS=""

CMD [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /mvn/app.jar" ]