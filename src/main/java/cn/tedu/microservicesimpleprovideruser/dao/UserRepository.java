package cn.tedu.microservicesimpleprovideruser.dao;

import cn.tedu.microservicesimpleprovideruser.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description :
 * Author : zhanghao
 * Create Date : 2019/7/25 15:19
 * Project Name : 公自用项目
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
