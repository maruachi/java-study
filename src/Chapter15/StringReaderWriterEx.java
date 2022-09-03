package Chapter15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriterEx {
    public static void main(String[] args) {
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data = 0;

        try{
            while ((data = input.read()) != -1){
                output.write(data);
                System.out.println(output.getBuffer());
                //한번에 작성하지 않고 모아서 작성
                //왜 output stream은 buffer가 있는데 reader는 없을까?
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("input data : " + inputData);
        System.out.println("output data : " + output.toString());
    }
}
