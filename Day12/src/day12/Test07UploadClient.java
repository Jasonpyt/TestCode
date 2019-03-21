package day12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test07UploadClient {

    public static void main(String[] args) throws IOException {

        //1:创建客户端对象
        Socket socket = new Socket("192.168.19.53",12306);
        //上传文件
        //2:创建字节输入流 关联源文件
        FileInputStream fis = new FileInputStream("D:\\mm.jpg");

        // 3:要将读取到的数据 写到 流中
        // 需要 输出流
        OutputStream out = socket.getOutputStream();

        //4:边读边写
        int len;

        byte[] buffer = new byte[8*1024];

        while((len=fis.read(buffer))!=-1){
            //写
            out.write(buffer,0,len);
        }
        // 如果 while循环做完了 还写不写数据到服务器了?
        // 现在在做文件上传  文件必须保证字节一模一样
        // 当你循环做完了，就不要将数据写在流中
        //你要关闭 写的操作
        socket.shutdownOutput();//不再写
        //保证上传文件的完整性
        // 接收反馈   需要 输入流读取
        InputStream in = socket.getInputStream();

        byte[] bys = new byte[1024];
        int read = in.read(bys);

        System.out.println("服务器说:"+new String(bys,0,read));

        //释放资源
        in.close();
        in.close();
        fis.close();
        socket.close();


    }
}
