package Chapter10;

public class ThreadEx5 {
    public static void main(String[] args) {

        Runnable r = new MyThread();
        Thread thread = new Thread(r);
        thread.start();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("+"));
        }

        System.out.println();
        System.out.println("Elapsed time: " + (System.currentTimeMillis() - startTime));
    }

    private static class MyThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 300; i++) {
                System.out.printf("%s", new String("-"));
            }
        }
    }
}
