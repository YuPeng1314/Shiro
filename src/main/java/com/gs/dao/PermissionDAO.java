package com.gs.dao;

import java.util.List;

/**
 * Created by Administrator on 2017/9/28.
 */
public interface PermissionDAO {

    List<String> listPermissions(String username);

}
