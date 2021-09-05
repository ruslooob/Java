import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Choices {
    ADD_USER,
    DELETE_USER,
    SHOW_USER,
    SHOW_USERS,
    EXIT,
    UNSUPPORTED_OPERATION;

    public static Choices fromInteger(Integer x) {
        return switch (x) {
            case 1 -> ADD_USER;
            case 2 -> DELETE_USER;
            case 3 -> SHOW_USER;
            case 4 -> SHOW_USERS;
            case 5 -> EXIT;
            default -> UNSUPPORTED_OPERATION;
        };
    }
}

public class Menu {
    /* Номер первого выбора */
    private final int FIRST_CHOICE = 1;
    /* Номер второго выбора */
    private final int LAST_CHOICE = 5;

    void showMenu() {
        System.out.println("-----------------");
        System.out.println("Menu");
        System.out.println("1) Add user");
        System.out.println("2) Delete user");
        System.out.println("3) Show user");
        System.out.println("4) Show all users");
        System.out.println("5) Exit");
        System.out.print("INPUT: ");
    }

    void startMenu() throws SQLException {
        int choice;

        do {
            showMenu();
            Scanner scanner = new Scanner(System.in);

            choice = scanner.nextInt();

            try {
                if (choice < FIRST_CHOICE || choice > LAST_CHOICE) {
                    throw new IllegalArgumentException("Вы выбрали не правильный пункт меню!");
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                continue;
            }

            switch (Choices.fromInteger(choice)) {
                case ADD_USER -> {
                    User user = getUserBeforeSave();
                    saveUser(user);
                }
                case DELETE_USER -> {
                    int id = getId();
                    deleteUser(id);
                }
                case SHOW_USER -> {
                    int id = getId();
                    showUser(id);
                }
                case SHOW_USERS -> {
                    showAllUsers();
                }
                case EXIT -> {
                    System.out.println("До свидания!");
                }
            }

        } while (choice != LAST_CHOICE);
    }

    void saveUser(User user) throws SQLException {
        Connection connection = ConnectionUtils.getMyConnection();
        Statement statement = connection.createStatement();

        String sql = String.format("insert into users(first_name, last_name, age) values('%s', '%s', %d)",
                user.getFirstName(), user.getLastName(), user.getAge());

        statement.executeUpdate(sql);
        System.out.println("Пользователь успешно добавлен");
        connection.close();
    }

    void deleteUser(int id) throws SQLException {
        Connection connection = ConnectionUtils.getMyConnection();
        Statement statement = connection.createStatement();

        String sql = String.format("delete from users where id=%d;", id);
        int result = statement.executeUpdate(sql);
        if (result == 1) {
            System.out.println("Пользователь успешно удален");
        } else {
            System.out.println("ID пользователя введен неверно!");
        }
        connection.close();
    }

    void showUser(int id) throws SQLException {
        User user = getUser(id);

        if (user != null) {
            System.out.println("Name: " + user.getFirstName());
            System.out.println("Фамилия: " + user.getLastName());
            System.out.println("Возраст: " + user.getAge());
        } else {
            System.out.println("Пользователя с таким ID не существует!");
        }

    }

    User getUser(int id) throws SQLException {
        Connection connection = ConnectionUtils.getMyConnection();
        Statement statement = connection.createStatement();

        String sql = String.format("select first_name, last_name, age from users where id=%d;", id);

        ResultSet rs = statement.executeQuery(sql);
        if (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            int age = rs.getInt("age");

            return new User(firstName, lastName, age);
        }
        return null;

    }

    void showAllUsers() throws SQLException {
        List<User> users = getAllUsers();

        for (User user : users) {
            System.out.format("%s %s %d \n", user.getFirstName(), user.getLastName(), user.getAge());
        }
     }

    List<User> getAllUsers() throws SQLException {
        Connection connection = ConnectionUtils.getMyConnection();
        Statement statement = connection.createStatement();

        String sql = "select first_name, last_name, age from users";

        ResultSet rs = statement.executeQuery(sql);

        List<User> users = new ArrayList<>();

        while (rs.next()) {
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            int age = rs.getInt("age");
            users.add(new User(firstName, lastName, age));
        }

        return users;
    }


    User getUserBeforeSave() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String first_name = scanner.nextLine();

        System.out.println("Введите фамилию: ");
        String last_name = scanner.nextLine();

        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();


        return new User(first_name, last_name, age);
    }

    int getId() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите идентификатор: ");

        return scanner.nextInt();
    }

}
