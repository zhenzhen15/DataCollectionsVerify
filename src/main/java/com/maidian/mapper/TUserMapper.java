package com.maidian.mapper;

import com.maidian.entiy.TUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zongzz
 * @since 2021-02-19
 */

public interface TUserMapper extends BaseMapper<TUser> {
      List<TUser> findAllUser();
}
