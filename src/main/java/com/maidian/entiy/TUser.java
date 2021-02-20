package com.maidian.entiy;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author zongzz
 * @since 2021-02-19
 */
@Data
@ApiModel(value="TUser对象", description="")
public class TUser{

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
