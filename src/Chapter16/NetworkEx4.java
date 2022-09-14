package Chapter16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx4 {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader input = null;
        String address = "https://n.news.naver.com/mnews/article/018/0005316196?sid=100";
        String line = "";

        try{
            url = new URL(address);
            input = new BufferedReader(new InputStreamReader(url.openStream()));

            while((line=input.readLine()) != null){
                System.out.println(line);
            }
            input.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
