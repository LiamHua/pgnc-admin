package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


/**
 * Comment表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:51
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class Comment implements Serializable {

    private static final long serialVersionUID = 342801456126524639L;

    /**
     * 评论表主键id
     */
    @ApiModelProperty(value = "评论表主键id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 评论的内容
     */
    @ApiModelProperty(value = "评论的内容")
    private String content;

    /**
     * 评论图片
     */
    @ApiModelProperty(value = "评论图片")
    private String commentImage;

    /**
     * 评论创建时间
     */
    @ApiModelProperty(value = "评论创建时间")
    private Date createTime;

    /**
     * 评论这个商品的用户
     */
    @ApiModelProperty(value = "评论这个商品的用户")
    private Integer userId;

    /**
     * 评论所属的商品
     */
    @ApiModelProperty(value = "评论所属的商品")
    private Integer goodsId;

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