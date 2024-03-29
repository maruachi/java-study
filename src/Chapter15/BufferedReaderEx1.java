package Chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("./src/Chapter15/BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr);

            String line = "";
            for(int i = 1; (line = br.readLine()) != null; i++){
                if(line.indexOf(";") != -1){// if the line has semicolon, print it!
                    System.out.println(i+":"+line);
                }
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
