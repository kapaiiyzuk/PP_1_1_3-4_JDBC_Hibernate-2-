package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Shawn", "Mendes", (byte) 24);
        userService.saveUser("Justin", "Bieber", (byte) 28);
        userService.saveUser("Ariana", "Grande", (byte) 29);
        userService.saveUser("Billie", "Eilish", (byte) 21);

        userService.removeUserById(3);

        List<User> strings = userService.getAllUsers();
        for (User s : strings)
            System.out.println(s);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

