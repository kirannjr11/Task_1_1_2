package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDaoJDBCImpl UserFromDatabase = new UserDaoJDBCImpl();
    public void createUsersTable() {
        UserFromDatabase.createUsersTable();

    }

    public void dropUsersTable() {
        UserFromDatabase.dropUsersTable();

    }

    public void saveUser(String name, String lastName, byte age) {
        UserFromDatabase.saveUser(name, lastName, age);
        System.out.println("User information: " + name + " , " + lastName + " and " + age + " has been added to database");

    }

    public void removeUserById(long id) {
        UserFromDatabase.removeUserById(id);

    }

    public List<User> getAllUsers() {
        return  UserFromDatabase.getAllUsers();
    }

    public void cleanUsersTable() {
        UserFromDatabase.cleanUsersTable();

    }
}
