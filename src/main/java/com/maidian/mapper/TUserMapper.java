package com.maidian.mapper;

import com.maidian.entiy.TUser;
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
@Mapper
@Component
public interface TUserMapper {
      List<TUser> findAllUser();
}
