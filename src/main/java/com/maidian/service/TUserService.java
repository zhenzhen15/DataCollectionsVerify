package com.maidian.service;

import com.maidian.entiy.TUser;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zongzz
 * @since 2021-02-19
 */
public interface TUserService {
    List<TUser> findAllUser();
}
