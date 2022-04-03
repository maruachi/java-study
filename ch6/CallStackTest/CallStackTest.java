package CallStackTest;

public class CallStackTest {
    public static void main(String[] args){
        System.out.println("main() start");
        firstMethod();
        System.out.println("main() end");
    }

    static void firstMethod(){
        System.out.println("firstMethod() start");
        secondMethod();
        System.out.println("firstMethod() end");
    }

    static void secondMethod(){
        System.out.println("SecondMethod() start");
        System.out.println("SecondMethod() end");
    }
}
