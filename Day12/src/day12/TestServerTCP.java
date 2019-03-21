package day12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServerTCP {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);

        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();

        byte[] buffer = new byte[1024*8];

        int len  = is.read(buffer);
        String msg = new String(buffer,0,len);

        is.close();

        socket.close();
    }

}
