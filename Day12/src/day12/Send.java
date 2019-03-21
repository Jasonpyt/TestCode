package day12;

import java.net.*;

public class Send {

    public static void main(String[] args) throws Exception {
        String str = "朋友真的是拿来出卖的吗??";
        DatagramSocket socket = new DatagramSocket();//创建socket就相当于创建码头

        DatagramPacket packet =     //创建packet,相当于创建集装箱
                new DatagramPacket(str.getBytes(), str.getBytes().length,InetAddress.getByName("127.0.0.1"),6666);
            socket.send(packet);    //发货将数据发出去

            socket.close();//关掉码头

    }
}
