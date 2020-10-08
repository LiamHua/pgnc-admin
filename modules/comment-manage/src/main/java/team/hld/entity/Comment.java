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
@ApiModel(value="Comment对象", description="")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论表主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "评论的内容")
    private String content;

    @ApiModelProperty(value = "评论图片")
    private String commentImage;

    @ApiModelProperty(value = "评论创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "评论这个商品的用户")
    private Integer userId;

    @ApiModelProperty(value = "评论所属的商品")
    private Integer goodsId;

    @ApiModelProperty(value = "保留字段1")
    private String retain1;

    @ApiModelProperty(value = "保留字段2")
    private String retain2;


}
