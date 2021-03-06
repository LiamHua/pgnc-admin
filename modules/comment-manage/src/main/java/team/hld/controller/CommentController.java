package team.hld.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import team.hld.entity.Comment;
import team.hld.service.CommentService;

import java.io.Serializable;
import java.util.List;

/**
 * Comment表服务接口层
 *
 * @author liam
 * @since 2020-10-09 13:12:51
 */
@RestController
public class CommentController {

    /**
     * 服务对象
     */
    @Autowired
    CommentService commentService;

    /**
     * 分页查询所有数据
     *
     * @param page    分页对象
     * @param comment 查询实体
     * @return 所有数据
     */
    @ApiOperation("分页查询所有数据")
    @GetMapping("/getAllComments")
    @PreAuthorize("hasAuthority('comment:list')")
    public R<IPage<Comment>> selectAll(Page<Comment> page, Comment comment) {
        return R.ok(commentService.page(page, new QueryWrapper<>(comment)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("/getCommentById/{id}")
    @PreAuthorize("hasAuthority('comment:list')")
    public R<Comment> selectOne(@PathVariable Serializable id) {
        return R.ok(commentService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param comment 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/addComment")
    @PreAuthorize("hasAuthority('comment:add')")
    public R<Integer> insert(@RequestBody Comment comment) {
        boolean rs = commentService.save(comment);
        return R.ok(rs ? comment.getId() : 0);
    }

    /**
     * 修改数据
     *
     * @param comment 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping("/updateComment")
    @PreAuthorize("hasAuthority('comment:update')")
    public R<Boolean> update(@RequestBody Comment comment) {
        return R.ok(commentService.updateById(comment));
    }

    /**
     * 单条/批量删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @ApiOperation("单条/批量删除数据")
    @DeleteMapping("/deleteComment")
    @PreAuthorize("hasAuthority('comment:delete')")
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return R.ok(commentService.removeByIds(idList));
    }
}
