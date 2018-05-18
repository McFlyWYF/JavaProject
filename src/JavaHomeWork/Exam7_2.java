package JavaHomeWork;

import java.io.*;

/*
1.创建一个文件
2.创建输入输出流
3.每次读取一个字节，直接将读取的字节存入文件
 */
public class Exam7_2 {

    public void copy() {
        byte[] a = new byte[10000];
        int n = -1;
        try {
            File f = new File("E:\\Java测试\\1\\Hello.txt");//新建文件
            OutputStream out = null;
            InputStream in = new FileInputStream("E:\\Java测试\\Hello.txt");//原始文件
            while ((n = in.read(a)) != -1){
                String s = new String(a);
                //System.out.println(s);//读取内容
                out = new FileOutputStream(f);
                out.write(a);
            }
            in.close();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Exam7_2 e = new Exam7_2();
        e.copy();
    }
}
