package Chapter10;

import javax.swing.*;

public class ThreadEx6 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

//        아래의 프로그램은 입력 대기 중에 실행될 수 없다.
//        하지만 스레드를 이용하면 실행 가능하도록 변경할 수 있다.
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
