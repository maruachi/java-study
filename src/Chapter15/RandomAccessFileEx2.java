package Chapter15;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
    public static void main(String[] args) {
        int[] score = {1, 100, 90, 90,
                       2, 70, 90, 100,
                       3, 100, 100, 100,
                       4, 70, 60, 80,
                       5, 70, 90, 100};
        try{
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
            for(int i = 0; i <score.length; i++){
                raf.writeInt(score[i]);
            }
            raf.seek(0); //file pointer가 그대로 유지가 됨
            while(true){
                System.out.println(raf.readInt());
            }
        }catch (EOFException eof){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
