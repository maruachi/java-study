package Chapter15;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx2 {
    public static void main(String[] args) {
        int sum = 0;
        int score = 0;

        FileInputStream fis = null;
        DataInputStream dis = null;

        try{
            fis = new FileInputStream("score.dat");
            dis = new DataInputStream(fis);

            while((score = dis.readInt()) != -1){
                System.out.println(score);
                sum += score;
            }

            dis.close();

        }catch (EOFException e){
            System.out.println("점수의 총합은 " + sum + "입니다.");
        }catch (IOException ie){
            ie.printStackTrace();
        }finally {
            try{
                if(dis != null){ //dis null이라면 call할 때 예외발생하니 if로 걸러줌
                    dis.close();
                }
            }catch(IOException ie){ //close할 때 IOException 가능
                ie.printStackTrace();
            }
        }
    }
}
