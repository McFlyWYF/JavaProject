package JavaHomeWork.MidExam;

import java.util.Date;
import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        Date date = new Date();
        System.out.println(date);
    }
}