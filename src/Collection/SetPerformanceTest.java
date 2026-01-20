package Collection;

import java.util.*;

public class SetPerformanceTest {
    static void main(String[] args) {
        int elementCount = 100000;

        Set<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet addition time: " + (endTime - startTime) + " nanoseconds");

        Set<Integer> treeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet addition time: " + (endTime - startTime) + " nanoseconds");

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            linkedHashSet.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet addition time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        endTime = System.nanoTime();
        System.out.println("HashSet read time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        endTime = System.nanoTime();
        System.out.println("TreeSet read time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet read time: " + (endTime - startTime) + " nanoseconds");
    }
}
