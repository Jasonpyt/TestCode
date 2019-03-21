package day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Test04_Client {
    public static void main(String[] args) throws IOException {
        //1.创建客户端
        Socket socket = new Socket("127.0.0.1", 6666);

        //2.写数据,需要输出流 谁提供 客户端
        OutputStream out = socket.getOutputStream();

        out.write("啦啦啦德玛西亚".getBytes());

        //释放资源
        out.close();

        socket.close();
    }
}
