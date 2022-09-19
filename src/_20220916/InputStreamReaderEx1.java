package _20220916;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderEx1 {
    public static void main(String[] args) throws IOException {


        InputStream fis = new FileInputStream("myExample.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        System.out.println("fis.available: " + fis.available());
        int x = fis.read();
        System.out.println((char)x);
        x = fis.read();
        System.out.println((char)x);
        System.out.println("fis.available: " + fis.available());
        System.out.println(isr.getEncoding());
        System.out.println("This is ready to read: " + isr.ready());
        System.out.println();

//        System.out.println("markSupported: " + isr.markSupported());
//        not support mark and reset in StreamReader
//        System.out.println("mark the start point");
//        isr.mark(26);
//        System.out.println("markSupported: " + isr.markSupported());
        System.out.println();
        System.out.println("skip line " + isr.skip(2));
        System.out.println();
        System.out.println("reset to the mark");
//        isr.reset();

        while (true) {
            int ch = isr.read();
            if(ch == -1){
                break;
            }
//            java에서는 unicode를 사용하는데 16비트(2바트)에 해당하는 데이터 크기를 가진다.
            System.out.print((char)ch);
        }
        System.out.println();
        System.out.println("This is ready to read: " + isr.ready());
    }
}
