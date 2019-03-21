package day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test06UploadServer {

    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(8888);

        Socket socket = ss.accept();

        InputStream in = socket.getInputStream();

        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day12\\读取.txt1.txt");

        int len;

        byte[] buffer = new byte[8*1024];

        while ((len = in.read(buffer))!= -1){
            fos.write(buffer,0,len);
        }

        fos.close();
        in.close();
        socket.close();
    }
}
