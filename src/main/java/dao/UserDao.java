package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;
//    public User(String account, String password, String name, String email, int age) {
public class UserDao {
    private static List<User> users = new ArrayList<>();
    static {
    User user1 = new User("Dung","123456","dung","dung@gmail",29);
    User user2 = new User("Son","123456","son","son@gmail",25);
    User user3 = new User("Huyen","123456","huyen","huyen@gmail",29);
    users.add(user1);
    users.add(user2);
    users.add(user3);

    }
    public static User chekLogin(Login login) {
        for (User u: users) {
            if (u.getAccount().equals(login.getAccount())
            && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
