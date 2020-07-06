package cn.itcast.user.service;

import cn.itcast.user.mapper.UserMapper;
import cn.itcast.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void deleteUserById(Long id) {
        this.userMapper.delete1(id);
    }
//
//
//    @Transactional
//    public void insert(User user) {
//        user.setCreated(new Date());
//        this.userMapper.insert(user);
//    }
//
//    @Transactional
//    public void update(User user) {
//        user.setUpdated(new Date());
//        this.userMapper.update(user);
//    }
}
