package team.hld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.hld.entity.Goods;
import team.hld.mapper.GoodsMapper;
import team.hld.service.GoodsService;

/**
 * Goods表服务实现类
 *
 * @author liam
 * @since 2020-10-09 13:12:30
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}