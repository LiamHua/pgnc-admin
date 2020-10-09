package team.hld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.hld.entity.Links;
import team.hld.mapper.LinksMapper;
import team.hld.service.LinksService;

/**
 * Links表服务实现类
 *
 * @author liam
 * @since 2020-10-09 13:12:19
 */
@Service
public class LinksServiceImpl extends ServiceImpl<LinksMapper, Links> implements LinksService {

}