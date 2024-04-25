FROM registry.access.redhat.com/ubi9/openjdk-21

#COPY target/demo-app-1.2.0.jar demo-app-1.2.0.jar
COPY target/demo-app-*.jar demo-app.jar

ENV APP_VERSION=""

COPY extract_version.sh /usr/local/bin/extract_version.sh
RUN chmod +x /usr/local/bin/extract_version.sh

ENTRYPOINT ["/bin/bash", "-c", "/usr/local/bin/extract_version.sh && java -jar demo-app-${APP_VERSION}.jar"]
#ENTRYPOINT ["java","-jar","demo-app-1.2.0.jar"]