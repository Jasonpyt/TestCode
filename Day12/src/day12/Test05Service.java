package day12;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test05Service {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8848);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        byte[] buffer = new byte[1024];

        int len = is.read(buffer);

        System.out.println("客户端说" + new String(buffer,0,len));

        System.out.println("----------服务器反馈--------------");

        OutputStream os = socket.getOutputStream();

        os.write("你的消息服务器已经接收到了".getBytes());

        os.close();

        is.close();

        socket.close();



    }
}
