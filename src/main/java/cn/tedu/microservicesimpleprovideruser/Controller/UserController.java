package cn.tedu.microservicesimpleprovideruser.Controller;

import cn.tedu.microservicesimpleprovideruser.Entity.User;
import cn.tedu.microservicesimpleprovideruser.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description :
 * Author : zhanghao
 * Create Date : 2019/7/25 15:20
 * Project Name : 公自用项目
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable  Long id){
        User findOne = this.userRepository.findOne(id);
        return  findOne;
    }
}
