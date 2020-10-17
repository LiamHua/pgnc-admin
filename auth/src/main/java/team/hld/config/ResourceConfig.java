package team.hld.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 获取配置中心的resourceIds数组
 * @author liam
 * @date 2020/10/16 12:02
 */
@Data
@Component
@ConfigurationProperties(prefix = "server")
public class ResourceConfig {
    private String[] resourceIds;
}
