package team.hld.carousel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liam
 * @date 2020/10/7 16:14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CarouselApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarouselApplication.class, args);
    }
}
