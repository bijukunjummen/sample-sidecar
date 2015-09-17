package sample;

import com.netflix.appinfo.HealthCheckHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.context.annotation.Bean;
import sample.cassandra.CassandraHealthCheckHandler;

@SpringBootApplication
@EnableSidecar
public class SampleSidecarApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSidecarApplication.class, args);
    }

    @Bean
    public HealthCheckHandler healthCheckHandler() {
        return new CassandraHealthCheckHandler();
    }
}
