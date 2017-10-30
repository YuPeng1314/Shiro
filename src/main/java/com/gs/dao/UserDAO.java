package com.gs.dao;

import com.gs.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/10/10.
 */
@Repository
public interface UserDAO {

    User getByNamePwd(@Param("name") String name, @Param("pwd") String pwd);

}
