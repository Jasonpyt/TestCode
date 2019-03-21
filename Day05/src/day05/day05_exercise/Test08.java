package day05.day05_exercise;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test08 {
    public static ArrayList<String> list = new ArrayList<>();
    static {
        list.add("XiaoHu");
        list.add("UZI");
        list.add("MLXG");
        list.add("Ming");
    }

    public static void main(String[] args) {
        System.out.println("请输入注册名:");
        String userName = new Scanner(System.in).nextLine();
        try{
            CheckId(userName);
            System.out.println("注册成功");
            System.out.println("您注册的用户名是:" + userName);
        }catch (LoginException e){
          //  e.printStackTrace();
           //e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);

        }finally {
            System.out.println("LogOut");
        }
    }

    public static boolean CheckId(String userName) throws LoginException {
        if (list.contains(userName)){
            throw  new LoginException("亲该ID已经注册过了请重试");
        }
        return  true;
    }
}
