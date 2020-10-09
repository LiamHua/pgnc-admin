package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;


/**
 * Category表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:45
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class Category implements Serializable {

    private static final long serialVersionUID = -15869139225326834L;

    /**
     * 分类表的主键id
     */
    @ApiModelProperty(value = "分类表的主键id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 父分类id，为0表示为第一级
     */
    @ApiModelProperty(value = "父分类id，为0表示为第一级")
    private Integer categoryIdParent;

    /**
     * 分类的内容
     */
    @ApiModelProperty(value = "分类的内容")
    private String categoryContent;

    /**
     * 商品的分类图片
     */
    @ApiModelProperty(value = "商品的分类图片")
    private String categoryImage;

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

}