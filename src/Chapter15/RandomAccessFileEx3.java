package Chapter15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx3 {
    public static void main(String[] args) {
        int sum = 0;
        try{
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
            int i = 4;

            while(true){
                raf.seek(i);
                sum += raf.readInt();
                i+=16; // 4개 단위에 하나의 int에 대해서만 합계 계산
            }
        }catch (EOFException e){
            System.out.println("sum : " + sum);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
