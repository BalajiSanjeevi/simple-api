# Getting Started

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


