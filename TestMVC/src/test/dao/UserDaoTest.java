package test.dao;

import org.user.dao.UserDao;
import org.user.domain.User;

public class UserDaoTest {
    
    public void testFindByUsername(){
        UserDao userDao = new UserDao();
        User user = userDao.findByUsername("aa");
        System.out.println(user);

    }

    public void testAdd() {
        UserDao userDao = new UserDao();

        User user = new User();
        user.setUsername("hh");
        user.setPassword("123");
        userDao.add(user);
    }
}
