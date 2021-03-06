package org.user.service;

import org.user.dao.UserDao;
import org.user.domain.User;

public class UserService {
    private UserDao userDao= new UserDao();

    public void regist(User user) throws UserException{
        User _user = userDao.findByUsername(user.getUsername());
        if(_user != null) throw new UserException("用户名" + user.getUsername() + ",已被注册！");
        userDao.add(user);
    }

    public User login(User form) throws UserException {
        User user = userDao.findByUsername(form.getUsername());
        if(user == null) throw new UserException("用户名不存在");
        if(!form.getPassword().equals(user.getPassword()))
            throw new UserException("密码错误");
        return user;

    }
}
