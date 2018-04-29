package SQLDemo;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class Window implements MouseListener {

    public JFrame frame = new JFrame("登录窗口");
    private JLabel label1 = new JLabel("账号:");
    private JTextField txt1 = new JTextField();
    private JLabel label2 = new JLabel("密码:");
    private JTextField txt2 = new JTextField();
    private JButton btn1 = new JButton("登录");
    private JButton btn2 = new JButton("注册");
    private JButton btn3 = new JButton("退出");
    private String text1;
    private String text2;
    private int distinguish;
    MyDBConnection myDB = new MyDBConnection();
    public DBOperation myOppr = new DBOperation(myDB);

    public Window() {

    }

    public void show() {
        frame.setLayout(null);
        frame.setSize(470, 300);
        frame.setLocation(400, 200);

        Font font = new Font("华文行楷", Font.BOLD, 20);
        label1.setFont(font);
        label1.setForeground(Color.gray);//字体颜色
        label2.setFont(font);
        label2.setForeground(Color.gray);

        txt1.setOpaque(false);//设置文本框透明
        txt2.setOpaque(false);

        btn1.setContentAreaFilled(false);//button透明
        btn1.setFont(font);
        btn1.setForeground(Color.gray);
        btn1.setBorder(BorderFactory.createRaisedBevelBorder());//突出按钮

        btn2.setContentAreaFilled(false);
        btn2.setFont(font);
        btn2.setForeground(Color.gray);
        btn2.setBorder(BorderFactory.createRaisedBevelBorder());

        btn3.setContentAreaFilled(false);
        btn3.setFont(font);
        btn3.setForeground(Color.gray);
        btn3.setBorder(BorderFactory.createRaisedBevelBorder());

        JPanel bj = new JPanel() {
            protected void paintComponent(Graphics g) {
                Image bg;
                try {
                    bg = ImageIO.read(new File("src/image/.PNG"));
                    g.drawImage(bg, 0, 0, getWidth(), getHeight(), null);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        label1.setBounds(100, 50, 100, 100);
        txt1.setBounds(180, 90, 150, 20);

        label2.setBounds(100, 80, 100, 100);
        txt2.setBounds(180, 120, 150, 20);

        btn1.setBounds(100, 200, 80, 20);
        btn2.setBounds(190, 200, 80, 20);
        btn3.setBounds(280, 200, 80, 20);

        frame.setContentPane(bj);
        frame.setLayout(null);
        frame.add(label1);
        frame.add(txt1);
        frame.add(label1);
        frame.add(txt2);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        btn1.addMouseListener(this);
        btn2.addMouseListener(this);
        btn3.addMouseListener(this);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        text1 = txt1.getText();//获取输入数据
        text2 = txt2.getText();

        if (distinguish == 1) {
            if (myOppr.selectName(text1)) {//登录判断
                JOptionPane.showMessageDialog(null, "登录成功", "提示", 2);
                txt1.setText("");
                txt2.setText("");
                distinguish = 4;
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "密码错误", "提示", 2);
                txt1.setText("");
                txt2.setText("");
            }
        }
        if (distinguish == 2) {
            String logi = (String) JOptionPane.showInputDialog(null, "请输入你的id：\n", "注册", JOptionPane.PLAIN_MESSAGE, null, null, "在这输入");
            String pas = (String) JOptionPane.showInputDialog(null, "请输入你的密码：\n", "注册", JOptionPane.PLAIN_MESSAGE, null, null, "在这输入");
            myOppr.insert(logi, pas, 0);
            JOptionPane.showMessageDialog(null, "注册成功", "提示", 2);
        }
        if (distinguish == 3) {
            int n = JOptionPane.showConfirmDialog(null, "是否退出?", "游戏结束", JOptionPane.YES_NO_OPTION);
            myDB.close();
            if (n == JOptionPane.YES_OPTION) {
                System.exit(1);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == btn1) {
            distinguish = 1;
            btn1.setForeground(Color.red);
            btn1.setBackground((Color) BorderFactory.createLoweredBevelBorder());
            btn2.setForeground(Color.gray);
            btn2.setBorder(BorderFactory.createRaisedBevelBorder());
            btn3.setForeground(Color.gray);
            btn3.setBorder(BorderFactory.createRaisedBevelBorder());
        }

        if (e.getSource() == btn2){
            distinguish = 2;
            btn1.setForeground(Color.gray);
            btn1.setBackground((Color) BorderFactory.createRaisedBevelBorder());
            btn2.setForeground(Color.red);
            btn2.setBorder(BorderFactory.createLoweredBevelBorder());
            btn3.setForeground(Color.gray);
            btn3.setBorder(BorderFactory.createRaisedBevelBorder());
        }

        if (e.getSource() == btn2){
            distinguish = 3;
            btn1.setForeground(Color.red);
            btn1.setBackground((Color) BorderFactory.createRaisedBevelBorder());
            btn2.setForeground(Color.gray);
            btn2.setBorder(BorderFactory.createRaisedBevelBorder());
            btn3.setForeground(Color.gray);
            btn3.setBorder(BorderFactory.createLoweredBevelBorder());
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        distinguish = 0;
        label1.setForeground(Color.gray);
        label2.setForeground(Color.gray);

        txt1.setOpaque(false);
        txt2.setOpaque(false);

        btn1.setContentAreaFilled(false);
        btn1.setForeground(Color.gray);
        btn1.setBorder(BorderFactory.createRaisedBevelBorder());

        btn2.setContentAreaFilled(false);
        btn2.setForeground(Color.gray);
        btn2.setBorder(BorderFactory.createRaisedBevelBorder());

        btn3.setContentAreaFilled(false);
        btn3.setForeground(Color.gray);
        btn3.setBorder(BorderFactory.createRaisedBevelBorder());
    }

    public String getText1(){
        return text1;
    }

    public String getText2(){
        return text2;
    }

    public int getDistinguish() {
        return distinguish;
    }

    public static void main(String[] args) {
        Window w = new Window();
    }
}
