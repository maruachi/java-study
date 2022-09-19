package Chapter13;

class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 threadEx1_1 = new ThreadEx1_1();
        threadEx1_1.run();
        Runnable threadEx1_2 = new ThreadEx1_2();
        threadEx1_2.run();
    }
}

class ThreadEx1_1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
