package Chapter10;

public class MyThreadGroup {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("myGroup");
        Thread[] myThreads = new Thread[]{
                new Thread(),
                new Thread()
        };

        System.out.println(threadGroup.activeCount());

        threadGroup.enumerate(myThreads);

        System.out.println(threadGroup.activeCount());
    }
}
