package com.lhalj.malllearning.mbg.mapper;

import com.lhalj.malllearning.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;


import java.util.List;

/**
 * 描述:后台用户与角色管理自定义Dao
 */
@Mapper
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
