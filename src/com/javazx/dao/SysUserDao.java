package com.javazx.dao;

import com.base.dao.BaseDao;
import com.javazx.page.SysUserModel;

/**
 * SysUser Mapper
 *
 * @author itmrchen
 */
public interface SysUserDao<T> extends BaseDao<T> {

    /**
     * 检查登录
     *
     * @param email
     * @param pwd
     * @return
     */
    public T queryLogin(SysUserModel model);

    /**
     * 查询邮箱总数，检查是否存在
     *
     * @param email
     * @return
     */
    public int getUserCountByEmail(String email);
}
