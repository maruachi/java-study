package Chapter10;

public class ThreadEx8 {
    public static void main(String[] args) {
        ThreadEx8_1 threadEx8_1 = new ThreadEx8_1();
        System.out.println(threadEx8_1.getPriority());
        ThreadEx8_2 threadEx8_2 = new ThreadEx8_2();
        System.out.println(threadEx8_2.getPriority());

        threadEx8_1.setPriority(5);
        threadEx8_1.start();
        threadEx8_2.start();
    }

    private static class ThreadEx8_1 extends Thread {
        public void run() {
            for (int i = 0; i < 300; i++) {
                System.out.printf(new String("-"));
                for (int j = 0; j < 10000000; j++) {
                }
            }
        }
    }

    private static class ThreadEx8_2 extends Thread{
        public void run() {
            for (int i = 0; i < 300; i++) {
                System.out.printf("%s", new String("+"));
                for (int j = 0; j < 10000000; j++) {
                }
            }
        }
    }
}
