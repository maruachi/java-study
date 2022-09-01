package Chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] buffer = new byte[10];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        input.read(buffer, 0 , buffer.length);
        output.write(buffer, 5, 5);

        outSrc = output.toByteArray();

        System.out.println("Input source  : " + Arrays.toString(inSrc));
        System.out.println("buffer        : " + Arrays.toString(buffer));
        System.out.println("Output source : " + Arrays.toString(outSrc));
    }
}
