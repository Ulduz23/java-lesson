package lesson6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTreeifyExample {

    public static void main(String[] args) {

        // Capacity-ni birbaşa 64 veririk (VACİB!)
        Map<BadKey, String> map = new HashMap<>(64);

        // 8-dən çox element eyni bucket-ə düşür
        for (int i = 1; i <= 10; i++) {
            map.put(new BadKey(i), "Value-" + i);
        }

        System.out.println("Map size: " + map.size());

        // Lookup test
        System.out.println(map.get(new BadKey(5)));
    }
}
