package ru.klimenko.crud231.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.klimenko.crud231.web.Model.User;
import ru.klimenko.crud231.web.dao.UserDao;
import ru.klimenko.crud231.web.dao.UserDaoImpl;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

   @Transactional
   public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.deleteUser(id);

    }

    @Override
    @Transactional
    public void editUser(User user) {
        userDao.editUser(user);

    }

    @Override
    @Transactional
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }


    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


}
