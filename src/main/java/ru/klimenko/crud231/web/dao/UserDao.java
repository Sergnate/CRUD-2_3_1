package ru.klimenko.crud231.web.dao;

import ru.klimenko.crud231.web.Model.User;

import java.util.List;

public interface UserDao {

        void saveUser(User user);

        void deleteUser(Long id);

        void editUser(User user);

        User getUserById(Long id);

        List<User> getAllUsers();

}



