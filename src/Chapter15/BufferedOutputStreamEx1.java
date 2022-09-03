package Chapter15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
    public static void main(String[] args) {

//        FilterInputStream filterInputStream = new FilterInputStream();
//        protected constructor -> 항상 상속 받아서 생성되아여 하는 기반 스트림으로서 보조 스트림에 활용된다
//        대표적으로 File Stream이 있다.
        try{
            FileOutputStream fos = new FileOutputStream("123.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
            for(int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }
            //close를 해줘야 buffer에 있는 것까지 output stream을 통해 전달한 다음 buffer는 flush된다
            bos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
