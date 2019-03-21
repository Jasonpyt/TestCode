package day12;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) throws IOException {
        //1:创建服务器对象 并指定端口号
        ServerSocket ss = new ServerSocket(8080);

        //2:等待客户端连接
        while(true){
            Socket socket = ss.accept();

            // 想要把所有的图片都加载到 需要使用多线程操作完成
            new Thread(
                    ()->{
                        try {
                            //执行什么操作呢？  完成 解析浏览器的请求 并给与响应
                            InputStream in = socket.getInputStream();
                            //想要解析的 请求信息中的第一行
                            InputStreamReader isr = new InputStreamReader(in);

                            BufferedReader br = new BufferedReader(isr);

                            String request = br.readLine();

                            // request 就是请求行
                            //   GET /day05/web/index.html HTTP/1.1
                            // 只要  day05/web/index.html
                            //根据空格切割
                            String[] split = request.split(" ");

                            String filePath = split[1].substring(1);

                            System.out.println(filePath);
                            //filePath  就是服务器中 资源的位置
                            //将资源数据 读取出来 并写给浏览器
                            FileInputStream fis = new FileInputStream(filePath);

                            byte[] buffer = new byte[8*1024];
                            int len = 0 ;

                            //所有的数据要写到流中
                            OutputStream out = socket
                                    .getOutputStream();



                            // 要给浏览器响应回去
                            //  响应行 响应头 响应体
                            out.write("HTTP/1.1 200 OK\r\n".getBytes());//设置响应行
                            out.write("Content-Type:text/html\r\n".getBytes());//设置响应头
                            out.write("\r\n".getBytes());

                            while((len=fis.read(buffer))!=-1){
                                out.write(buffer,0,len);
                            }

                            //释放资源
                            out.close();
                            fis.close();
                            br.close();
                            isr.close();
                            in.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
            ).start();
        }

    }
}
