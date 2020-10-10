package team.hld;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import javax.annotation.sql.DataSourceDefinition;


/**
 * @author liam
 * @date 2020/10/6 11:21
 */
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@MapperScan("team.hld.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
