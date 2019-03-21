package day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test05Cilent {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.103", 88480);

        OutputStream out = socket.getOutputStream();

        out.write("马里拉0".getBytes());

        InputStream is = socket.getInputStream();

        int len;
        byte[] bytes = new byte[2048];
        len = is.read(bytes);

        System.out.println("服务器说:" + new String(bytes,0,len));

        is.close();
        out.close();
        socket.close();
    }
}
