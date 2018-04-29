package JavaHomeWork.MidExam;

import java.util.Date;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Long sum = 0L;
        Long num = 0L;

        if (n == 5) {
            for (int i = 1; i <= 10; i++) {
                num = num * 10 + n;
                sum = sum +  num;
            }
        }

        System.out.println(sum);
        Date date = new Date();
        System.out.println(date);
    }
}
