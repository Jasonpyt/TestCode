package day12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();   //创建socket相当于创建码头

        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);;//相当于创建集装箱

        socket.receive(packet);//接受数据

        byte[] arr = packet.getData();//获取有效的数据

        int len = packet.getLength();//获取有效的字节个数

        System.out.println(new java.lang.String(arr,0,len));

        socket.close();
    }
}
