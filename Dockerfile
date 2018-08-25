FROM java:8-jre

USER root

ADD ./target/GenApp1-0.1-SNAPSHOT.jar /opt/GenApp1-0.1-SNAPSHOT.jar
CMD ["java", "-Xmx200m", "-jar", "/opt/GenApp1-0.1-SNAPSHOT.jar"]

EXPOSE 8080

