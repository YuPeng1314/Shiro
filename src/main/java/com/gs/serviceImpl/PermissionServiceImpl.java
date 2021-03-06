package com.gs.serviceImpl;

import com.gs.dao.PermissionDAO;
import com.gs.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/9/29.
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDAO permissionDAO;

    public List<String> listPermissions(String username) {
        return permissionDAO.listPermissions(username);
    }
}
