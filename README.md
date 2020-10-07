# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.monster.aws.simple-api' is invalid and this project uses 'com.monster.aws.simpleapi' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/maven-plugin/reference/html/#build-image)
* [Coroutines section of the Spring Framework Documentation](https://docs.spring.io/spring/docs/5.2.9.RELEASE/spring-framework-reference/languages.html#coroutines)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#production-ready)
* [Prometheus](https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/html/production-ready-features.html#production-ready-metrics-export-prometheus)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Run Prometheus

Update host for grafana and api to the system IP in prometheus.yml

docker run -d -p 9090:9090 \
    -v ${WORK_DIR}/simple-api/prometheus.yml:/etc/prometheus/prometheus.yml \
    prom/prometheus

### Run Grafana
docker run -d -p 3000:3000 grafana/grafana

### Build API
./mvnw spring-boot:build-image

docker run -d -p 8080:8080 simple-api:0.0.1-SNAPSHOT


