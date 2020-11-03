package team.hld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author liam
 * @date 2020/10/11 14:54
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 密码编码器
     *
     * @return BCrypt加密算法
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 密码登录需要
     *
     * @return
     * @throws Exception
     */
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 拦截器规则
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/oauth/**").permitAll()
                .and()
                .formLogin()
                .permitAll();
    }

//    /**
//     * 跨域配置
//     * @return
//     */
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            //重写父类提供的跨域请求处理的接口
//            public void addCorsMappings(CorsRegistry registry) {
//                //添加映射路径
//                registry.addMapping("/**")
//                        //放行哪些原始域
//                        .allowedOrigins("*")
//                        //是否发送Cookie信息
//                        .allowCredentials(true)
//                        //放行哪些原始域(请求方式)
//                        .allowedMethods("GET","POST", "PUT", "DELETE")
//                        //放行哪些原始域(头部信息)
//                        .allowedHeaders("*")
//                        //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
//                        .exposedHeaders("Header1", "Header2");
//            }
//        };
//    }
}
