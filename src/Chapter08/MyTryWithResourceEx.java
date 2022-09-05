package Chapter08;

import java.io.*;

public class MyTryWithResourceEx {
    public static void main(String[] args) {
        int sum = 0;
        try(FileInputStream fis = new FileInputStream("score.dat");
            DataInputStream dis = new DataInputStream(fis)){
            while(true){
                int score = dis.readInt();
                System.out.println(score);
                sum += score;
            }
        }catch (EOFException eof){
            System.out.println("점수의 총합은 " + sum + "입니다.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
