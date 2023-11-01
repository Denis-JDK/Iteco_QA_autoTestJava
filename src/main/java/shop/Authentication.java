package shop;

import java.util.ArrayList;
import java.util.List;

public class Authentication {
   // boolean authentication = false;
    private Repository repository;

    public Authentication() {
        repository = new Repository();
    }

    public boolean authenticationUsers(User user){
        if (repository.users.contains(user)){
            System.out.println("User contains in repository");
            return true;
        }else {
            System.out.println("Pls add to repository");
            return false;
        }

    }

}
