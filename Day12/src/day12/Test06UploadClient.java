package day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Test06UploadClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.103", 8888);

        //上传文件
        //创建字节输入流关联源文件

        FileInputStream fis = new FileInputStream("E:\\就业班\\TestCode\\src\\day12\\读取.txt.txt");
        OutputStream out = socket.getOutputStream();
        //边读边写
        int len;
        byte[] buffer  = new byte[1024*8];

        while ((len = fis.read(buffer)) != -1){
            out.write(buffer,0,len);
        }

        //释放资源
        out.close();
        fis.close();
        socket.close();
    }
}
