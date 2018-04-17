package JavaHomeWork.test;

import java.util.Scanner;

//用charAt()方法将一个字符串反转后输出
public class Test4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
