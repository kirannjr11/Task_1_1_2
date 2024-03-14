package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // implement algorithm here
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Kiran", "Ghale", (byte) 26);
        userService.saveUser("Namjoon", "Kim", (byte) 30);
        userService.saveUser("Santosh", "Dahit", (byte) 25);
        userService.saveUser("Neymar", "Santos", (byte) 33);

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

//        userService.cleanUsersTable();
//        userService.dropUsersTable();

    }
}
