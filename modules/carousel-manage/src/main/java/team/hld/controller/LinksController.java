package team.hld.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import team.hld.entity.Links;
import team.hld.service.LinksService;

import java.io.Serializable;
import java.util.List;

/**
 * Links表服务接口层
 *
 * @author liam
 * @since 2020-10-09 13:12:19
 */
@RestController
public class LinksController {

    /**
     * 服务对象
     */
    @Autowired
    LinksService linksService;

    /**
     * 分页查询所有数据
     *
     * @param page  分页对象
     * @param links 查询实体
     * @return 所有数据
     */
    @ApiOperation("分页查询所有数据")
    @GetMapping("/getAllLink")
    @PreAuthorize("hasAuthority('links:list')")
    public R<IPage<Links>> selectAll(Page<Links> page, Links links) {
        return R.ok(linksService.page(page, new QueryWrapper<>(links)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("/getLinkById/{id}")
    public R<Links> selectOne(@PathVariable Serializable id) {
        return R.ok(linksService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param links 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/addLink")
    public R<Integer> insert(@RequestBody Links links) {
        boolean rs = linksService.save(links);
        return R.ok(rs ? links.getId() : 0);
    }

    /**
     * 修改数据
     *
     * @param links 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping("/updateLink")
    public R<Boolean> update(@RequestBody Links links) {
        return R.ok(linksService.updateById(links));
    }

    /**
     * 单条/批量删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @ApiOperation("单条/批量删除数据")
    @DeleteMapping("/deleteLink")
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return R.ok(linksService.removeByIds(idList));
    }
}