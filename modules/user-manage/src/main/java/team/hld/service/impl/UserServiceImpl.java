package team.hld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.hld.entity.User;
import team.hld.mapper.UserMapper;
import team.hld.service.UserService;

/**
 * User表服务实现类
 *
 * @author liam
 * @since 2020-10-09 13:12:03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}