package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


/**
 * Goods表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:28
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class Goods implements Serializable {

    private static final long serialVersionUID = 216560900212122513L;

    /**
     * 二手商品表的自增id
     */
    @ApiModelProperty(value = "二手商品表的自增id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 商品表的标题
     */
    @ApiModelProperty(value = "商品表的标题")
    private String goodsTitle;

    /**
     * 商品简介
     */
    @ApiModelProperty(value = "商品简介")
    private String goodsIntroduction;

    /**
     * 商品标价，即商品在线上卖出的价格
     */
    @ApiModelProperty(value = "商品标价，即商品在线上卖出的价格")
    private Double goodsPrice;

    /**
     * 商品原价
     */
    @ApiModelProperty(value = "商品原价")
    private Double goodsOriginalPrice;

    /**
     * 商品二级分类，从分类表中获取商品分类
     */
    @ApiModelProperty(value = "商品二级分类，从分类表中获取商品分类")
    private Integer categoryId;

    /**
     * 卖家微信联系方式
     */
    @ApiModelProperty(value = "卖家微信联系方式")
    private String wechat;

    /**
     * 卖家手机联系方式
     */
    @ApiModelProperty(value = "卖家手机联系方式")
    private String phone;

    /**
     * 卖家qq号
     */
    @ApiModelProperty(value = "卖家qq号")
    private String qq;

    /**
     * 这个商品所属的用户id
     */
    @ApiModelProperty(value = "这个商品所属的用户id")
    private Integer userId;

    /**
     * 商品状态，1 售卖中，2 已下架
     */
    @ApiModelProperty(value = "商品状态，1 售卖中，2 已下架")
    private Integer goodsState;

    /**
     * 商品的创建时间
     */
    @ApiModelProperty(value = "商品的创建时间")
    private Date createTime;

    /**
     * 商品的修改时间
     */
    @ApiModelProperty(value = "商品的修改时间")
    private Date updateTime;

    /**
     * 商品浏览量
     */
    @ApiModelProperty(value = "商品浏览量")
    private Integer viewSize;

    /**
     * 保留字段1
     */
    @ApiModelProperty(value = "保留字段1")
    private String retain1;

    /**
     * 保留字段2
     */
    @ApiModelProperty(value = "保留字段2")
    private String retain2;

    /**
     * 保留字段3
     */
    @ApiModelProperty(value = "保留字段3")
    private String retain3;

}