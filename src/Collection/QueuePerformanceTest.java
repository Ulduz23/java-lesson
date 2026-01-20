package Collection;

import java.util.*;

public class QueuePerformanceTest {
    static void main(String[] args) {
        int elementCount = 100000;

        Queue<Integer> linkedListQueue = new LinkedList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            linkedListQueue.offer(i);
        }
        long endTime = System.nanoTime();
        System.out.println("LinkedList Queue addition time: " + (endTime - startTime) + " nanoseconds");

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        startTime = System.nanoTime();
        for (int i = 0; i < elementCount; i++) {
            priorityQueue.offer(i);
        }
        endTime = System.nanoTime();
        System.out.println("PriorityQueue addition time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        while (!linkedListQueue.isEmpty()) {
            linkedListQueue.poll();
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList Queue read time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        while (!priorityQueue.isEmpty()) {
            priorityQueue.poll();
        }
        endTime = System.nanoTime();
        System.out.println("PriorityQueue read time: " + (endTime - startTime) + " nanoseconds");
    }
}
