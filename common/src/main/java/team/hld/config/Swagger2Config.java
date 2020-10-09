package team.hld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liam
 * @date 2020/10/9 14:00
 */
@Configuration
public class Swagger2Config{
    @Bean
    public Docket createRestApi() {// 创建API基本信息
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("team.hld.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建API的基本信息，这些信息会在Swagger UI中进行显示
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("飞鸽校园后台管理系统API")
                .description("飞鸽校园后台管理系统提供的RESTful APIs")
                .contact(new Contact("liam", null, "liamhuazai@gmail.com"))
                .version("1.0")
                .build();
    }
}