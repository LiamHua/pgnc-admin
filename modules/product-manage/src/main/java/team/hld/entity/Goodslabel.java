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
@ApiModel(value="Goodslabel对象", description="")
public class Goodslabel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品标签表主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "商品id")
    private Integer goodsId;

    @ApiModelProperty(value = "标签id")
    private Integer label;


}
