package com.maidian.service.impl;

import com.maidian.entiy.TUser;
import com.maidian.mapper.TUserMapper;
import com.maidian.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zongzz
 * @since 2021-02-19
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {
    @Autowired
    private TUserMapper tUserMapper;
    @Override
    public List<TUser> findAllUser() {
        return tUserMapper.findAllUser();
    }
}
