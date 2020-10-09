package team.hld.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;


/**
 * User表实体类
 *
 * @author liam
 * @since 2020-10-09 13:12:02
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "")
public class User implements Serializable {

    private static final long serialVersionUID = -52480937342376558L;

    /**
     * 用户表的自增id，主键
     */
    @ApiModelProperty(value = "用户表的自增id，主键")
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户昵称
     */
    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    /**
     * 用户手机号，不可为空
     */
    @ApiModelProperty(value = "用户手机号，不可为空")
    private String telephone;

    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String password;

    /**
     * 用户邮箱地址，可为空，注册后再绑定
     */
    @ApiModelProperty(value = "用户邮箱地址，可为空，注册后再绑定")
    private String email;

    /**
     * 用户头像地址，在程序中会为用户注入默认的头像
     */
    @ApiModelProperty(value = "用户头像地址，在程序中会为用户注入默认的头像")
    private String userImage;

    /**
     * 用户的真实姓名
     */
    @ApiModelProperty(value = "用户的真实姓名")
    private String realName;

    /**
     * 用户积分
     */
    @ApiModelProperty(value = "用户积分")
    private Integer integral;

    /**
     * 用户性别
     */
    @ApiModelProperty(value = "用户性别")
    private String sex;

    /**
     * 用户学校id
     */
    @ApiModelProperty(value = "用户学校id")
    private Integer userSchoolId;

    /**
     * 用户毕业年份
     */
    @ApiModelProperty(value = "用户毕业年份")
    private String graduateYear;

    /**
     * 个性签名
     */
    @ApiModelProperty(value = "个性签名")
    private String signature;

    /**
     * 用户创建时间
     */
    @ApiModelProperty(value = "用户创建时间")
    private Date createTime;

    /**
     * 用户进行修改操作的时间
     */
    @ApiModelProperty(value = "用户进行修改操作的时间")
    private Date updateTime;

    /**
     * 状态，1、正常 2、异常
     */
    @ApiModelProperty(value = "状态，1、正常 2、异常")
    private Integer state;

    /**
     * 用户角色，即用户权限  1、管理员  2、注册用户  3、游客
     */
    @ApiModelProperty(value = "用户角色，即用户权限  1、管理员  2、注册用户  3、游客")
    private Integer role;

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

    /**
     * 保留字段3
     */
    @ApiModelProperty(value = "保留字段3")
    private String retain3;

}