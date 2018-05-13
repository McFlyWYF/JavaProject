import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static com.sun.deploy.trace.TraceLevel.UI;

public class LoginShape extends JFrame implements ActionListener {

    //定义组件
    JButton jb1, jb2, jb3 = null;
    JRadioButton jrb1, jrb2 = null;
    JPanel jp1, jp2, jp3, jp4 = null;
    JTextField account = null;
    JLabel jlb1, jlb2, jlb3 = null;
    JPasswordField password = null;
    ButtonGroup bg = null;

    static String userword;
    static String pwd;

    static Connection ct = null;
    PreparedStatement ps = null;
    ResultSet rs = null;


    public static void main(String[] args) {
        LoginShape l = new LoginShape();

        String uri = "jdbc:mysql://localhost:3306/XSCJ";
        String user = "root";
        String password = "wyf19971006..";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            ct = DriverManager.getConnection(uri,user,password);
            System.out.println("数据库连接成功");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public LoginShape() {

        //创建组件
        jb1 = new JButton("登录");
        jb2 = new JButton("注册");
        jb3 = new JButton("退出");
        //设置监听
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);

        jrb1 = new JRadioButton("教师");
        jrb2 = new JRadioButton("学生");
        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);
        jrb2.setSelected(true);

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();

        jlb1 = new JLabel("用户名：");
        jlb2 = new JLabel("密    码：");
        jlb3 = new JLabel("权    限：");

        account = new JTextField(10);
        password = new JPasswordField(10);
        //加入到JPanel中
        jp1.add(jlb1);
        jp1.add(account);

        jp2.add(jlb2);
        jp2.add(password);

        jp3.add(jlb3);
        jp3.add(jrb1);
        jp3.add(jrb2);

        jp4.add(jb1);
        jp4.add(jb2);
        jp4.add(jb3);

        //加入JFrame中
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.add(jp4);
        //设置布局管理器
        this.setLayout(new GridLayout(4, 1));
        //给窗口设置标题
        this.setTitle("系统界面");
        //设置窗体大小
        this.setSize(400, 300);
        //设置窗体初始位置
        this.setLocation(200, 150);
        //设置当关闭窗口时，保证JVM也退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗体
        this.setVisible(true);
        this.setResizable(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "退出") {
            System.exit(0);
        } else if (e.getActionCommand() == "登录") {
            if (jrb1.isSelected()) {
                try {
                    ps = ct.prepareStatement("select * from teacher where 权限=?");
                    ps.setString(1, "教师");
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        userword = rs.getString(2);
                        pwd = rs.getString(3);
                        System.out.println("成功取到");
                        System.out.println(userword + "\t" + pwd + "\t");
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                login1();
            } else if (e.getActionCommand() == "注册") {
                clear();
            }
        }
    }

    public void login1() {
        if (userword.equals(account.getText()) && pwd.equals(password.getText())) {
            JOptionPane.showMessageDialog(null, "登录成功", "提示消息", JOptionPane.WARNING_MESSAGE);
            clear();
            dispose();
            UI ui = new UI();
        } else if (account.getText().isEmpty() && password.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "请输入用户名和密码", "提示消息", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "用户名或者密码错误", "提示消息", JOptionPane.ERROR_MESSAGE);
            clear();
        }
    }


    public void clear() {
        account.setText("");
        password.setText("");
    }
}

