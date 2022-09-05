package Chapter08;

public class MyExceptionEx1 {
    public static void main(String[] args) {
        try{
            System.out.println("before exception");
            System.out.println(1/0);
            System.out.println("after exception");
        }catch (ArithmeticException e){
            System.out.println("catch the exception");
        }
    }
}
