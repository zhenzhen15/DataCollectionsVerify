package com.maidian.controller;

import com.maidian.entiy.TUser;
import com.maidian.service.TUserService;
import com.maidian.service.impl.TUserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zongzz
 * @since 2021-02-19
 */
@RestController
//@RequestMapping("/t-user")
@Slf4j
public class TUserController {

    @Autowired
    @Qualifier("TUserServiceImpl")
    private TUserService tUserService;

    @GetMapping("findAllUser")
    @ResponseBody
    public List<TUser> findAllUser(){
        return tUserService.findAllUser();
    }

    @GetMapping("index")
    @ResponseBody
    public String index(){
        return "{'name':'xiaoming','age':'13'}";
    }

}
