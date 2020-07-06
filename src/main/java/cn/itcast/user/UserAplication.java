package cn.itcast.user;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.itcast.user.mapper")
public class UserAplication {
    public static void main(String[] args) {
        SpringApplication.run(UserAplication.class);
    }
}
