package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Category对象", description="")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "分类表的主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "父分类id，为0表示为第一级")
    private Integer categoryIdParent;

    @ApiModelProperty(value = "分类的内容")
    private String categoryContent;

    @ApiModelProperty(value = "商品的分类图片")
    private String categoryImage;

    @ApiModelProperty(value = "保留字段1")
    private String retain1;

    @ApiModelProperty(value = "保留字段2")
    private String retain2;


}
