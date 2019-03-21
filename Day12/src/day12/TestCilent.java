package day12;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TestCilent {

    public static void main(String[] args) throws IOException {
        Socket so = new Socket("192.168.0.1", 6666);

        OutputStream os = so.getOutputStream();

        os.write("你好吗? tcp ,我来了".getBytes());

        os.close();
        so.close();
    }
}
