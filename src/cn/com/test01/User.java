package cn.com.test01;

public class User {
    private static User user;

    private User() {
    }

    public static User getInstance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }


}
