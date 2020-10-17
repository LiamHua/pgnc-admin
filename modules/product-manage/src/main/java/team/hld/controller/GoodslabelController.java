package team.hld.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import team.hld.entity.Goodslabel;
import team.hld.service.GoodslabelService;

import java.io.Serializable;
import java.util.List;

/**
 * Goodslabel表服务接口层
 *
 * @author liam
 * @since 2020-10-09 13:12:32
 */
@RestController
public class GoodslabelController {

    /**
     * 服务对象
     */
    @Autowired
    GoodslabelService goodslabelService;

    /**
     * 分页查询所有数据
     *
     * @param page       分页对象
     * @param goodslabel 查询实体
     * @return 所有数据
     */
    @ApiOperation("分页查询所有数据")
    @GetMapping("/getAllGoodsLabel")
    @PreAuthorize("hasAuthority('goodslabel:list')")
    public R<IPage<Goodslabel>> selectAll(Page<Goodslabel> page, Goodslabel goodslabel) {
        return R.ok(goodslabelService.page(page, new QueryWrapper<>(goodslabel)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("/getGoodsLabel/{id}")
    @PreAuthorize("hasAuthority('goodslabel:list')")
    public R<Goodslabel> selectOne(@PathVariable Serializable id) {
        return R.ok(goodslabelService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param goodslabel 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/addGoodsLabel")
    @PreAuthorize("hasAuthority('goodslabel:add')")
    public R<Integer> insert(@RequestBody Goodslabel goodslabel) {
        boolean rs = goodslabelService.save(goodslabel);
        return R.ok(rs ? goodslabel.getId() : 0);
    }

    /**
     * 修改数据
     *
     * @param goodslabel 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping("/updateGoodsLabel")
    @PreAuthorize("hasAuthority('goodslabel:update')")
    public R<Boolean> update(@RequestBody Goodslabel goodslabel) {
        return R.ok(goodslabelService.updateById(goodslabel));
    }

    /**
     * 单条/批量删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @ApiOperation("单条/批量删除数据")
    @DeleteMapping("/deleteGoodsLabel")
    @PreAuthorize("hasAuthority('goodslabel:delete')")
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return R.ok(goodslabelService.removeByIds(idList));
    }
}