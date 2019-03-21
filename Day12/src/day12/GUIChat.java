package day12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIChat extends Frame {
  public  GUIChat(){
      init();
      southPanel();
      centerPanel();
      event();

  }

    private void event() {
      this.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });

    }

    private void centerPanel() {
        Panel center = new Panel(); //创建中间的panel
        TextArea viewText = new TextArea(); //显示的文本区域
        TextArea sendText = new TextArea(5,1);//发送的文本区域
        center.setLayout(new BorderLayout());//设置为边界布局管理器
        center.add(sendText,BorderLayout.SOUTH);//发送的文本区域放在南边
        center.add(viewText,BorderLayout.CENTER);//显示区域放在中间
        viewText.setEditable(false);//设置不可以编辑
        this.add(center,BorderLayout.CENTER);
        viewText.setBackground(new Color(255,255,255));//设置背景颜色
        sendText.setFont(new Font("XXX",Font.PLAIN,20));
        viewText.setFont(new Font("XXX",Font.PLAIN,20));
    }

    private void southPanel() {
      Panel south = new Panel();//创建南边的Panel
       TextField  tf = new TextField(15);  //创建文本字段存储ip地址
        Button send = new Button("send");//创建发送按钮
        Button log = new Button("log");//创建记录按钮
        Button clear = new Button("clear");//创建清屏按钮
        Button shake = new Button("shake");//创建震动按钮

        south.add(tf);
        south.add(send);
        south.add(log);
        south.add(clear);
        south.add(shake);

        this.add(south,BorderLayout.SOUTH); //将Panel放在Frame的南边


    }

    private void init() {
        this.setLocation(500,50);
        this.setSize(400,600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GUIChat();
    }
}
