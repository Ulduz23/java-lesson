package lesson7;

import java.util.Optional;

public class OptionalLesson {

    static void main(String[] args) {
        String str1 = null;
        Optional<String> str2 = Optional.ofNullable(null);

        System.out.println(str1);
        System.out.println(str2.get());
    }
}
