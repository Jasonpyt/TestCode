package day12;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test04_Service {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端口对象
        ServerSocket ss = new ServerSocket(6666);
        //开启并等待客户端链接
        Socket accept = ss.accept();

        //如果没有客户端链接 状态就是阻塞状态,如果有客户端链接就返回客户端对象

        System.out.println("小样现身吧:" + accept.getInetAddress().getHostName());

        //3.读取 客户端数据
        //需要输入输出流谁提供 客户端
        InputStream in = accept.getInputStream();

        byte[] buffer = new byte[8*1024];

        int len ;

        while ((len = in.read(buffer))!= -1){
            int read = in.read(buffer);

        }

        //解析

        System.out.println("客户端说:" + new String(buffer,0,len));

        //释放资源
        in.close();
        accept.close();
    }
}
