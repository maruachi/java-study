package Chapter08;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }
    }

    private static void method1() throws Exception {
        throw new Exception();
    }
}
