package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.Year;
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
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户表的自增id，主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "用户手机号，不可为空")
    private String telephone;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "用户邮箱地址，可为空，注册后再绑定")
    private String email;

    @ApiModelProperty(value = "用户头像地址，在程序中会为用户注入默认的头像")
    private String userImage;

    @ApiModelProperty(value = "用户的真实姓名")
    private String realName;

    @ApiModelProperty(value = "用户积分")
    private Integer integral;

    @ApiModelProperty(value = "用户性别")
    private String sex;

    @ApiModelProperty(value = "用户学校id")
    private Integer userSchoolId;

    @ApiModelProperty(value = "用户毕业年份")
    private Year graduateYear;

    @ApiModelProperty(value = "个性签名")
    private String signature;

    @ApiModelProperty(value = "用户创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "用户进行修改操作的时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "状态，1、正常 2、异常")
    private Integer state;

    @ApiModelProperty(value = "用户角色，即用户权限  1、管理员  2、注册用户  3、游客")
    private Integer role;

    @ApiModelProperty(value = "保留字段1")
    private String retain1;

    @ApiModelProperty(value = "保留字段2")
    private String retain2;

    @ApiModelProperty(value = "保留字段3")
    private String retain3;


}
