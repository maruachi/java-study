package _20220916;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamEx1 {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("myExample.txt");

        int x = fis.read();
        System.out.println((char)x);
        x = fis.read();
        System.out.println((char)x);
    }
}
