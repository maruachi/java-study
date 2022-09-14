package Chapter16;

import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
    public static void main(String[] args) {
        URL url = null;
        String address = "https://n.news.naver.com/mnews/article/018/0005316196?sid=100";

        try {
            url = new URL(address);
            URLConnection conn = url.openConnection();

            System.out.println("conn.toString(): "+conn);
            System.out.println("getAllowUserInteraction(): " + conn.getAllowUserInteraction());
            System.out.println("getConnectTimeout(): " + conn.getConnectTimeout());
            System.out.println("getContent(): "+conn.getContent());
            System.out.println("getContentEncoding(): " + conn.getContentEncoding());
            System.out.println("getContentLength(): " + conn.getContentLength());
            System.out.println("getContentType(): " + conn.getContentType());
            System.out.println("getDate(): " + conn.getDate());
            System.out.println("conn.getDefaultUseCaches(): " + conn.getDefaultUseCaches());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
