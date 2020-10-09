package team.hld.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import team.hld.entity.Goodsimage;
import team.hld.service.GoodsimageService;

import java.io.Serializable;
import java.util.List;

/**
 * Goodsimage表服务接口层
 *
 * @author liam
 * @since 2020-10-09 13:12:31
 */
@RestController
public class GoodsimageController {

    /**
     * 服务对象
     */
    @Autowired
    GoodsimageService goodsimageService;

    /**
     * 分页查询所有数据
     *
     * @param page       分页对象
     * @param goodsimage 查询实体
     * @return 所有数据
     */
    @ApiOperation("分页查询所有数据")
    @GetMapping
    public R<IPage<Goodsimage>> selectAll(Page<Goodsimage> page, Goodsimage goodsimage) {
        return R.ok(goodsimageService.page(page, new QueryWrapper<>(goodsimage)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("{id}")
    public R<Goodsimage> selectOne(@PathVariable Serializable id) {
        return R.ok(goodsimageService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param goodsimage 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping
    public R<Integer> insert(@RequestBody Goodsimage goodsimage) {
        boolean rs = goodsimageService.save(goodsimage);
        return R.ok(rs ? goodsimage.getId() : 0);
    }

    /**
     * 修改数据
     *
     * @param goodsimage 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping
    public R<Boolean> update(@RequestBody Goodsimage goodsimage) {
        return R.ok(goodsimageService.updateById(goodsimage));
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
        return R.ok(goodsimageService.removeByIds(idList));
    }
}