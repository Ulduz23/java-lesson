package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Streams {

    static void main(String[] args) {
        List<Users> users = new ArrayList<>();

        users.add(new Users("Ramin", 20, true));
        users.add(new Users("Nermin", 16, false));
        users.add(new Users("Tebriz", 29, true));


        List<Users> list = users.stream()
                .filter(user -> user.getAge() >= 18)
                .toList();

        /*for (Users user : list) {
            System.out.println(user);
        }*/

        list.forEach(System.out::println);
    }
}
