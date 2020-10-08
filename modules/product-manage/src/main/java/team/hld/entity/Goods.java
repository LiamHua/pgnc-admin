package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author liam
 * @since 2020-10-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Goods对象", description="")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "二手商品表的自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商品表的标题")
    private String goodsTitle;

    @ApiModelProperty(value = "商品简介")
    private String goodsIntroduction;

    @ApiModelProperty(value = "商品标价，即商品在线上卖出的价格")
    private Double goodsPrice;

    @ApiModelProperty(value = "商品原价")
    private Double goodsOriginalPrice;

    @ApiModelProperty(value = "商品二级分类，从分类表中获取商品分类")
    private Integer categoryId;

    @ApiModelProperty(value = "卖家微信联系方式")
    private String wechat;

    @ApiModelProperty(value = "卖家手机联系方式")
    private String phone;

    @ApiModelProperty(value = "卖家qq号")
    private String qq;

    @ApiModelProperty(value = "这个商品所属的用户id")
    private Integer userId;

    @ApiModelProperty(value = "商品状态，1 售卖中，2 已下架")
    private Integer goodsState;

    @ApiModelProperty(value = "商品的创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "商品的修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "商品浏览量")
    private Integer viewSize;

    @ApiModelProperty(value = "保留字段1")
    private String retain1;

    @ApiModelProperty(value = "保留字段2")
    private String retain2;

    @ApiModelProperty(value = "保留字段3")
    private String retain3;


}
