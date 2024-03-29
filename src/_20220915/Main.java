package _20220915;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        String string = "Hello, world. IO 안녕하세요";

        OutputStream outputStream = new FileOutputStream("example.txt");
        outputStream.write(string.getBytes(StandardCharsets.UTF_8));
        outputStream.close();

        InputStream inputStream = new FileInputStream("example.txt");
        OutputStream outputStream1 = new FileOutputStream("copyExample.txt");

        byte[] buffer = new byte[5];
        while(true){
            int len = inputStream.read(buffer);
            if (len == -1) {
                break;
            }
            outputStream1.write(buffer, 0, len);
        }
        outputStream1.flush();
    }
}
