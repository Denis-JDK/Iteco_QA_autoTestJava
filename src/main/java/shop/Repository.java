package shop;

import java.util.ArrayList;
import java.util.List;

public class Repository {

   static List<User>users=new ArrayList<>();

    public void addUsers(User user){
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }
}
