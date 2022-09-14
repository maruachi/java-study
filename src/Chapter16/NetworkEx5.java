package Chapter16;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class NetworkEx5 {
    public static void main(String[] args) {
        URL url = null;
        InputStream in = null;
        FileOutputStream out = null;
        String address = "https://n.news.naver.com/mnews/article/018/0005316196?sid=100";

        int ch = 0;

        try {
            url = new URL(address);
            in = url.openStream();
            out = new FileOutputStream("naver_news.html");
            while((ch = in.read()) != -1){
                out.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
