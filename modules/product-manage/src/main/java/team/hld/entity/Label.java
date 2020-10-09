package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;


/**
 * Label表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:32
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class Label implements Serializable {

    private static final long serialVersionUID = -51985227212255254L;

    /**
     * 标签表id
     */
    @ApiModelProperty(value = "标签表id")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 标签内容
     */
    @ApiModelProperty(value = "标签内容")
    private String label;

}