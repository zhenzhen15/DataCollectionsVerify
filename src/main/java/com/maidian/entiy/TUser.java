package com.maidian.entiy;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zongzz
 * @since 2021-02-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value="TUser对象", description="")
public class TUser extends Model {

    private static final long serialVersionUID = 1L;

    private String userid;

    private String username;

    private String password;

    private String name;

    private String sex;

    private String addr;

    private String roleid;

    private String description;

    private String bianhao;

    private Integer status;

    private String email;

    private String code;


}
