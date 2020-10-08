package team.hld.category;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liam
 * @date 2020/10/7 16:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CategoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CategoryApplication.class, args);
    }
}
