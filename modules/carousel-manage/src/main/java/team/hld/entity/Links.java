package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;


/**
 * Links表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:18
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class Links implements Serializable {

    private static final long serialVersionUID = 213791310795369447L;

    /**
     * 友链表主键id
     */
    @ApiModelProperty(value = "友链表主键id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 友链链接地址
     */
    @ApiModelProperty(value = "友链链接地址")
    private String toLink;

    /**
     * 友链链接的图片
     */
    @ApiModelProperty(value = "友链链接的图片")
    private String imageLink;

    /**
     * 友链的一些说明
     */
    @ApiModelProperty(value = "友链的一些说明")
    private String comment;

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