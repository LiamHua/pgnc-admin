package team.hld.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liam
 * @date 2020/10/7 16:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MessageApplication {
    public static void main(String[] args) {
        SpringApplication.run(MessageApplication.class, args);
    }
}
