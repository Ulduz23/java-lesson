package Task10;

public class NumberPrinter {

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 8; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 8; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());

        thread1.start();
        thread2.start();
    }
}