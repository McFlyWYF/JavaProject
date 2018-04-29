import javax.swing.*;
import java.awt.*;

public class LoginShape {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("系统登录界面");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);

        f.setSize(400,400);
        f.setLocation(200,200);

        Container con = f.getContentPane();
        con.setLayout(new GridLayout(7,1));

        JPanel pan1 = new JPanel();
        JLabel title = new JLabel("欢迎登录本系统");
        title.setFont(new Font("宋体",Font.BOLD,20));
        pan1.add(title);
        con.add(pan1);

        JPanel pan2 = new JPanel();
        JLabel name = new JLabel("用户名");
        pan2.add(name);
        TextField tf = new TextField(20);
        tf.setText("输入用户名");
        pan2.add(tf);
        con.add(pan2);



        JPanel pan3 = new JPanel();
        JLabel pass = new JLabel("密码");
        pan3.add(pass);
        TextField password = new TextField(20);
        password.setText("输入密码");
        pan3.add(password);
        con.add(pan3);


        JPanel pan4 = new JPanel();
        JButton b_log=new JButton("登陆");
        pan4.add(b_log);
        JButton b_exit=new JButton("退出");
        pan4.add(b_exit);
        con.add(pan4);

        /*
        JPanel pan5 = new JPanel();
        con.add(pan5);
        JPanel pan6 = new JPanel();
        con.add(pan6);
        JPanel pan7 = new JPanel();
        con.add(pan7);
        */
    }
}
