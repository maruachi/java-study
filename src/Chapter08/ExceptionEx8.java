package Chapter08;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            String message = ae.getMessage();
            System.out.println("예외메세지 : " + message);
        }
    }
}
