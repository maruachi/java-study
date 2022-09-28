package Chapter10;

public class ThreadEx3 {
    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.start();
    }

    private static class ThreadEx3_1 extends Thread {
        public void run() {
            throwException();
        }

        private void throwException() {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
