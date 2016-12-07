FROM openjdk:8-jdk

ENV JAVA_OPTS ""
ENV DB_URL ""

ADD mysql-connector-java-5.1.34.jar /mysql.jar
ADD app.jar /mvn/app.jar

CMD [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -cp /mysql.jar:/mvn/app.jar com.lq.StandaloneApp"  ]