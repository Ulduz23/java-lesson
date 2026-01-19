package lesson6;

import java.util.*;

public class ListVsSetVsMapBenchmark {

    public static void main(String[] args) {

        System.out.println("START");

        int size = 1_000_000;

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer, String> map = new HashMap<>();

        // ===============================
        // ADD (1 milyon data)
        // ===============================
        for (int i = 0; i < size; i++) {
            list.add(i);
            set.add(i);
            map.put(i, "value-" + i);
        }

        // ===============================
        // CONTAINS TEST
        // ===============================

        // ArrayList.contains
        long start = System.nanoTime();
        list.contains(size - 1);
        long listTime = System.nanoTime() - start;

        // HashSet.contains
        start = System.nanoTime();
        set.contains(size - 1);
        long setTime = System.nanoTime() - start;

        // HashMap.containsKey
        start = System.nanoTime();
        map.containsKey(size - 1);
        long mapKeyTime = System.nanoTime() - start;

        // HashMap.containsValue (bilə-bilə yavaşı göstəririk)
        start = System.nanoTime();
        map.containsValue("value-" + (size - 1));
        long mapValueTime = System.nanoTime() - start;

        // ===============================
        // RESULTS
        // ===============================
        System.out.println("ArrayList contains     : " + listTime / 1_000 + " µs");
        System.out.println("HashSet contains       : " + setTime / 1_000 + " µs");
        System.out.println("HashMap containsKey    : " + mapKeyTime / 1_000 + " µs");
        System.out.println("HashMap containsValue  : " + mapValueTime / 1_000 + " µs");

        System.out.println("END");
    }
}
