package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;


/**
 * School表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:10
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class School implements Serializable {

    private static final long serialVersionUID = 532349287885450599L;

    /**
     * 学校表的主键
     */
    @ApiModelProperty(value = "学校表的主键")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 学校名称
     */
    @ApiModelProperty(value = "学校名称")
    private String schoolName;

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