package _20220916;

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Integer: " + Integer.SIZE / 8 + " bytes");
        System.out.println("Character: " + Character.SIZE / 8 + " bytes");
        // java는 primitive char type으로 unicode 2 bytes를 사용한다
    }
}
