package team.hld.controller;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author liam
 * @date 2020/10/15 12:05
 */
@RestController
public class UserController {
    @RequestMapping("/user")
    public Principal getUserInfo(OAuth2Authentication authentication) {
        return authentication;
    }
}
