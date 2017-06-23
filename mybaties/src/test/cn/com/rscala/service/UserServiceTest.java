package cn.com.rscala.service;

import cn.com.rscala.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by hadoop on 2017/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
@WebAppConfiguration
public class UserServiceTest {
    @Autowired
    UserService us;

    public void setUp() throws Exception {

    }

    public void tearDown() throws Exception {

    }
    @Test
    @org.springframework.transaction.annotation.Transactional
    @Rollback(true)
    public void getUserMapper() throws Exception {
        System.out.println(us.getUserMapper().selectByPrimaryKey(1));
        System.out.println(us.getUserMapper().insert(new User(6,"xml test","asdpwd",98)));
        System.out.println(us.getUserMapper().selectByPrimaryKey(6));
    }

}