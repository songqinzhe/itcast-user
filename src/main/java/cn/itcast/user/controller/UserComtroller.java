package cn.itcast.user.controller;

import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserComtroller {
    @Autowired
    private UserService userService;
    @GetMapping("{id}")
    public User queryUserById(@PathVariable("id") Long id){
        User user = this.userService.queryUserById(id);
        System.out.println(user.getName());
        return user;
    }

    @GetMapping("/delete/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        this.userService.deleteUserById(id);
    }
//
//    @PostMapping("insert")
//    public void insert(User user) {
//        System.out.println(user.getBirthday());
//
//    }
//
//    @PostMapping("update")
//    public void update(User user){
//        this.userService.update(user);
//    }



    @GetMapping("test")
    public String test(){
        return "hello";
    }


}
