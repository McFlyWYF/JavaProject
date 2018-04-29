package JavaHomeWork;

import java.io.File;

public class Exam7 {

    //采用递归判断是否还有子目录
    public static void find(File f){
        File[] files = f.listFiles();
        for (File f1 : files){
            if (f1.isDirectory()){
                find(f1);
            }else {
                if (f1.getName().endsWith(".txt")){
                    System.out.println(f1.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("E:\\Java测试");
        find(f);
    }
}