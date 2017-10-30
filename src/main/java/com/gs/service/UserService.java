package com.gs.service;

import com.gs.bean.User;

/**
 * Created by Administrator on 2017/10/10.
 */
public interface UserService {
    User getByNamePwd(String name, String pwd);
}
