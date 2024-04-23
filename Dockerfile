FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:1.19-1
COPY source/target/demo-app-0.0.1.jar demo-app-0.0.1.jar
ENTRYPOINT ["java","-jar","demo-app-0.0.1.jar"]