package team.hld.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liam
 * @date 2020/10/7 16:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SchoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class, args);
    }
}
