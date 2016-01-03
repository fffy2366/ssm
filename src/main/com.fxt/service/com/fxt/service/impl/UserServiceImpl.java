package com.fxt.service.com.fxt.service.impl;

import com.fxt.dao.UserMapper;
import com.fxt.pojo.User;
import com.fxt.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")  
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);
    }
}