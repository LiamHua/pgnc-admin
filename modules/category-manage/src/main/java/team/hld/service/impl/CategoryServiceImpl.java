package team.hld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.hld.entity.Category;
import team.hld.mapper.CategoryMapper;
import team.hld.service.CategoryService;

/**
 * Category表服务实现类
 *
 * @author liam
 * @since 2020-10-09 13:12:45
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}