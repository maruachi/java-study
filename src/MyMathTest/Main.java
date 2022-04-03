package MyMathTest;

public class Main {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        System.out.println("add(5L, 3L) = " + m.add(5L, 3L));
        System.out.println("substract(5L, 3L) = "+m.substract(5L, 3L));
        System.out.println("multiply(5L, 3L) = "+m.multiply(5L, 3L));
        System.out.println("divide(5L, 3L) = "+m.divide(5L, 3L));
    }
}
