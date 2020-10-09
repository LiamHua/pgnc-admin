package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;


/**
 * Goodslabel表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:31
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class Goodslabel implements Serializable {

    private static final long serialVersionUID = -73031097133106112L;

    /**
     * 商品标签表主键id
     */
    @ApiModelProperty(value = "商品标签表主键id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    @ApiModelProperty(value = "商品id")
    private Integer goodsId;

    /**
     * 标签id
     */
    @ApiModelProperty(value = "标签id")
    private Integer label;

}