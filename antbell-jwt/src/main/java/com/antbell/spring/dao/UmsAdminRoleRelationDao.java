package com.antbell.spring.dao;

import com.antbell.spring.mbg.model.UmsPermission;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 *
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
