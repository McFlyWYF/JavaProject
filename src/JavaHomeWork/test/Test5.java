package JavaHomeWork.test;

import java.util.Scanner;

//查找一个字符串在某个子串中出现的次数
public class Test5 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String s = input.nextLine();
        System.out.println("输入一个要查询的子串：");
        String s1 = input.nextLine();
        int n = 0;//出现下标
        int j = 0;//统计个数

        if (!s.contains(s1)){
            System.out.println("该字符串中不包含该子串");
        }else {
            while (s.indexOf(s1,n) >= 0 && n < s.length()) {

                    j++;
                    n = s.indexOf(s1,n) + s1.length();
            }
        }
        System.out.println("该子串在字符串中出现的次数是：" + j);
    }
}
