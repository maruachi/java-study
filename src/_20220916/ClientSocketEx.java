package _20220916;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class ClientSocketEx {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 7779);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello my name is donggyu".getBytes(StandardCharsets.UTF_8));
    }
}
