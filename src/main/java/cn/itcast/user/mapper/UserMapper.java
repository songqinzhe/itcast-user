package cn.itcast.user.mapper;

import cn.itcast.user.pojo.User;

import tk.mybatis.mapper.common.Mapper;

//@Mapper
//public interface UserMapper {
//
//    User queryUserById(Long id);
//
//    void deleteUserById(Long id);
//
//    void insert(User user);
//
//    void update(User user);
//}


public interface UserMapper extends Mapper<User> {
    public void delete1(Long id);
}