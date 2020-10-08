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
@ApiModel(value="Goodsimage对象", description="")
public class Goodsimage implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "图片地址")
    private String imageAddress;

    @ApiModelProperty(value = "图片对应的商品id")
    private Integer goodsId;

    @ApiModelProperty(value = "图片类型，0为封面，1为非封面")
    private Integer imageType;


}
