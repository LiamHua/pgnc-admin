package team.hld.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import team.hld.entity.User;
import team.hld.mapper.UserMapper;

import java.util.List;

/**
 * @author liam
 * @date 2020/10/12 19:14
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("nickname", username);
        User user = userMapper.selectOne(userQueryWrapper);
        if (user == null) {
            return null;
        }
        List<String> privileges = userMapper.getPrivileges(user.getId());
        String[] privilegeArray = privileges.toArray(new String[privileges.size()]);
        return org.springframework.security.core.userdetails.
                User.withUsername(user.getTelephone()).password(passwordEncoder.encode(user.getPassword()))
                .authorities(privilegeArray)
                .build();
    }
}
