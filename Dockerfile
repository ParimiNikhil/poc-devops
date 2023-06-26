FROM adoptopenjdk/openjdk11:jre-11.0.19_7-ubuntu
VOLUME /tmp
COPY target/devops*.jar /tmp/poc-devops.jar
CMD java -jar poc-devops.jar
RUN ls -lrt