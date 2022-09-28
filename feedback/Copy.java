package _20220921;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Copy {
    public static void main(String[] args) throws IOException {
        String string = "hello, IO world";
        OutputStream fos = new FileOutputStream("example.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write(string);
//        스트림으로 인코딩을 강제할 수 있다.
        osw.flush();
        osw.close();

        InputStream fis = new FileInputStream("example.txt");
        OutputStream fosCopy = new FileOutputStream("exampleCopy.txt");
        byte[] buffer = new byte[10];
        while (true) {
            int len = fis.read(buffer);
            if (len == -1) {
                break;
            }
            fosCopy.write(buffer, 0, len);
        }
        fis.close();
        fosCopy.flush();
        fosCopy.close();
    }
}
