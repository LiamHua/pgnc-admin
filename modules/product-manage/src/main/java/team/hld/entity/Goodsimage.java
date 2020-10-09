package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;


/**
 * Goodsimage表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:30
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class Goodsimage implements Serializable {

    private static final long serialVersionUID = -15464234032375348L;

    /**
     * 图片主键id
     */
    @ApiModelProperty(value = "图片主键id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 图片地址
     */
    @ApiModelProperty(value = "图片地址")
    private String imageAddress;

    /**
     * 图片对应的商品id
     */
    @ApiModelProperty(value = "图片对应的商品id")
    private Integer goodsId;

    /**
     * 图片类型，0为封面，1为非封面
     */
    @ApiModelProperty(value = "图片类型，0为封面，1为非封面")
    private Integer imageType;

}