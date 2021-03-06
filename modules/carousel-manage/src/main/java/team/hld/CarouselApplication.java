package team.hld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liam
 * @date 2020/10/7 16:14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("team.hld.mapper")
public class CarouselApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarouselApplication.class, args);
    }
}
