package Chapter08;

public class ExceptionEx12 {
    public static void main(String[] args) throws Exception{
        method1();
    }

    private static void method1() throws Exception{
        method2();
    }

    private static void method2() throws Exception{
        throw new Exception();
    }
}
