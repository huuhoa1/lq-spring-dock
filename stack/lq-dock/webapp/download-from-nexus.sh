#!/bin/sh
set -e

b=`curl -s http://godev-nexus:8081/repository/maven-snapshots/lq-spring-dock/lq-spring-dock/0.0.1-SNAPSHOT/maven-metadata.xml | awk -F '[<>]' '/buildNumber/{print $3}'`
t=`curl -s http://godev-nexus:8081/repository/maven-snapshots/lq-spring-dock/lq-spring-dock/0.0.1-SNAPSHOT/maven-metadata.xml | awk -F '[<>]' '/timestamp/{print $3}'`

echo curl -s -o app.jar -L http://godev-nexus:8081/repository/maven-snapshots/lq-spring-dock/lq-spring-dock/0.0.1-SNAPSHOT/lq-spring-dock-0.0.1-${t}-${b}.jar
curl -s -o app.jar -L http://godev-nexus:8081/repository/maven-snapshots/lq-spring-dock/lq-spring-dock/0.0.1-SNAPSHOT/lq-spring-dock-0.0.1-${t}-${b}.jar
ls -ltra app.jar