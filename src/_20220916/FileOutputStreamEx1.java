package _20220916;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamEx1 {
    public static void main(String[] args) throws IOException {
        OutputStream fos = new FileOutputStream("myExample.txt");
        OutputStream os = new FileOutputStream("myExample.txt");
        os.write("hello, new world, 반갑습니다.".getBytes(StandardCharsets.UTF_8));
        System.out.println(fos.getClass());
//        System.out.println(fos.getClass().write());
//        no write
    }
}
