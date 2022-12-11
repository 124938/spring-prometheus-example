# spring-prometheus-example
This repo contains integration of spring boot app with prometheus and grafana to display metrics

## Prometheus - Setup

### Pull latest prometheus image from docker registry
```
docker pull prom/prometheus
```

### Create prometheus yml file
```
global:
    scrape_interval: 15s

scrape_configs:
- job_name: 'prometheus'
  scrape_interval: 10s

  static_configs:
    - targets: ['localhost:9090']

- job_name: 'spring-prometheus-example'
  metrics_path: '/actuator/prometheus'
  scrape_interval: 10s
  static_configs: 
    - targets: ['172.17.0.1:8080']
```

### Start prometheus process using docker
```
docker run -d -p 9090:9090 -v /home/asus/tech_soft/prom/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
```

### Start prometheus UI using browser
```
http://localhost:9090
```
![Alt text](./images/prometheus/prom-home.png?raw=true "Home Page")

![Alt text](./images/prometheus/prom-target.png?raw=true "Target")

## Grafana - Setup

### Pull latest grafana image from docker registry
```
docker pull grafana/grafana
```

### Start grafana process using docker
```
docker run -d -p 3000:3000 grafana/grafana
```

### Start grafana UI using browser
```
http://localhost:3030
admin
admin
```
