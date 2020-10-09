package team.hld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import team.hld.entity.Comment;
import team.hld.mapper.CommentMapper;
import team.hld.service.CommentService;

/**
 * Comment表服务实现类
 *
 * @author liam
 * @since 2020-10-09 13:12:51
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}