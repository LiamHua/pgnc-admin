package team.hld.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import team.hld.entity.Goods;
import team.hld.service.GoodsService;

import java.io.Serializable;
import java.util.List;

/**
 * Goods表服务接口层
 *
 * @author liam
 * @since 2020-10-09 13:12:30
 */
@RestController
public class GoodsController {

    /**
     * 服务对象
     */
    @Autowired
    GoodsService goodsService;

    /**
     * 分页查询所有数据
     *
     * @param page  分页对象
     * @param goods 查询实体
     * @return 所有数据
     */
    @ApiOperation("分页查询所有数据")
    @GetMapping("/getAllGoods")
    @PreAuthorize("hasAuthority('goods:list')")
    public R<IPage<Goods>> selectAll(Page<Goods> page, Goods goods) {
        return R.ok(goodsService.page(page, new QueryWrapper<>(goods)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("/getGoodsById/{id}")
    @PreAuthorize("hasAuthority('goods:list')")
    public R<Goods> selectOne(@PathVariable Serializable id) {
        return R.ok(goodsService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param goods 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("/addGoods")
    @PreAuthorize("hasAuthority('goods:add')")
    public R<Integer> insert(@RequestBody Goods goods) {
        boolean rs = goodsService.save(goods);
        return R.ok(rs ? goods.getId() : 0);
    }

    /**
     * 修改数据
     *
     * @param goods 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PutMapping("/updateGoods")
    @PreAuthorize("hasAuthority('goods:update')")
    public R<Boolean> update(@RequestBody Goods goods) {
        return R.ok(goodsService.updateById(goods));
    }

    /**
     * 单条/批量删除数据
     *
     * @param idList 主键集合
     * @return 删除结果
     */
    @ApiOperation("单条/批量删除数据")
    @DeleteMapping("/deleteGoods")
    @PreAuthorize("hasAuthority('goods:delete')")
    public R<Boolean> delete(@RequestParam("idList") List<Long> idList) {
        return R.ok(goodsService.removeByIds(idList));
    }
}