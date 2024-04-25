#FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.19-1
FROM registry.access.redhat.com/ubi9/openjdk-21
COPY target/demo-app-1.2.0.jar demo-app-1.2.0.jar
ENTRYPOINT ["java","-jar","demo-app-1.2.0.jar"]