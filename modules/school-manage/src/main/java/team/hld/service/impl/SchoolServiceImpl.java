package team.hld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.hld.entity.School;
import team.hld.mapper.SchoolMapper;
import team.hld.service.SchoolService;

/**
 * School表服务实现类
 *
 * @author liam
 * @since 2020-10-09 13:12:11
 */
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements SchoolService {

}