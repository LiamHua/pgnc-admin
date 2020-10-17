package team.hld.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.hld.entity.School;
import team.hld.service.SchoolService;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * School表服务接口层
 *
 * @author liam
 * @since 2020-10-09 13:12:11
 */
@RestController
public class SchoolController {

    /**
     * 服务对象
     */
    @Autowired
    SchoolService schoolService;

    @ApiOperation("测试")
    @GetMapping("/test")
    public String test() {
        return new Date().toString();
    }

    /**
     * 分页查询所有数据
     *
     * @param page   分页对象
     * @param school 查询实体
     * @return 所有数据
     */
    @ApiOperation("分页查询所有数据")
    @GetMapping
    public R<IPage<School>> selectAll(Page<School> page, School school) {
        return R.ok(schoolService.page(page, new QueryWrapper<>(school)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("get/{id}")
    public R<School> selectOne(@PathVariable Serializable id) {
        return R.ok(schoolService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param school 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping
    public R<Integer> insert(@RequestBody School school) {
        boolean rs = schoolService.save(school);
        return R.ok(rs ? school.getId() : 0);
    }

    /**
     * 修改数据
     *
     * @param school 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping
    public R<Boolean> update(@RequestBody School school) {
        return R.ok(schoolService.updateById(school));
    }

    /**
     * 单条/批量删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @ApiOperation("单条/批量删除数据")
    @DeleteMapping
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return R.ok(schoolService.removeByIds(idList));
    }
}