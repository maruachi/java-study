package _20220916;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class SocketEx1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        System.out.println(socket.getLocalPort());
        System.out.println(socket.getLocalAddress());
        System.out.println(socket.getClass());
        System.out.println(socket.getKeepAlive());

        ServerSocket serverSocket = new ServerSocket(7779);
        socket = serverSocket.accept();
        System.out.println(socket.getLocalPort());
        System.out.println(socket.getLocalAddress());
        System.out.println(socket.getClass());
        System.out.println(socket.getKeepAlive());
        InputStream inputStream = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        while (true){
            int len = isr.read();
            if(len == -1){
                break;
            }
            System.out.print((char)len);
        }
    }
}
