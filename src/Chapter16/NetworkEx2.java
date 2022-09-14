package Chapter16;

import java.net.URL;

public class NetworkEx2 {
    public static void main(String[] args) throws Exception {
//        http://www.codechobo.com:80/sample/hello.html?referer=codechobo#index1
//        쿼리와 참조가 무슨역할???

        URL url = new URL("https://www.naver.com/");

        System.out.println("url.getAuthoriy(): " + url.getAuthority());
        System.out.println("url.getContent(): " + url.getContent());
        System.out.println("url.getDefaultPort(): " + url.getDefaultPort());
        System.out.println("url.getFile(): " + url.getFile());
        System.out.println("url.getHost(): " + url.getHost());
        System.out.println("url.getPath(): " + url.getPath());
        System.out.println("url.getProtocal():" + url.getProtocol());
        System.out.println("url.getQuery(): " + url.getQuery());
        System.out.println("url.getRef(): " + url.getRef());
        System.out.println("url.getUserInfo(): " + url.getUserInfo());
        System.out.println("url.toExternalForm(): " + url.toExternalForm());
        System.out.println("url.toURI(): " + url.toURI());
    }
}
