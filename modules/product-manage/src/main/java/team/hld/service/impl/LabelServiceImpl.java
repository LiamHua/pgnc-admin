package team.hld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.hld.entity.Label;
import team.hld.mapper.LabelMapper;
import team.hld.service.LabelService;

/**
 * Label表服务实现类
 *
 * @author liam
 * @since 2020-10-09 13:12:34
 */
@Service
public class LabelServiceImpl extends ServiceImpl<LabelMapper, Label> implements LabelService {

}