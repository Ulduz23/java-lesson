package Collection;

import java.util.*;

public class ListPerformanceTest {
    public static void main(String[] args) {
        int elementCount = 100000;

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList addition time: " + (endTime - startTime) + " nanoseconds");

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList addition time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList read time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList read time: " + (endTime - startTime) + " nanoseconds");
    }
}
