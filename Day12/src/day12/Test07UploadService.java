package day12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test07UploadService {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        Socket so = ss.accept();
        FileOutputStream fos = new FileOutputStream("E:\\就业班\\TestCode\\src\\day12\\读取.txt1.txt");
        InputStream in = so.getInputStream();
        int len;

        byte[] buffer= new byte[1024];

        while ((len = in.read(buffer))!= -1){
            fos.write(buffer,0,len);
        }


        System.out.println("-------------已经上传成功-------------------");

        OutputStream os = so.getOutputStream();

        os.write("文件上传成功".getBytes());

        os.close();
        fos.close();
        so.close();
    }
}
