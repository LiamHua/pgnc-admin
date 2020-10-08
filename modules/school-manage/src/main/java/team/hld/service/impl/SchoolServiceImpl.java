package team.hld.service.impl;

import team.hld.entity.School;
import team.hld.mapper.SchoolMapper;
import team.hld.service.ISchoolService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liam
 * @since 2020-10-08
 */
@Service
public class SchoolServiceImpl extends ServiceImpl<SchoolMapper, School> implements ISchoolService {

}
