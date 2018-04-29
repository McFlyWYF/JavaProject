package JavaHomeWork.MidExam;

import java.util.Date;
import java.util.Scanner;

public class Six {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0;i < 10;i++){
            a[i] = in.nextInt();
        }

        int max = a[0],min = a[0];
        double average,sum = 0;

        for (int i = 0;i < 10;i++){
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }

            sum = a[i] + sum;
        }
        average = sum / 10;

        System.out.println("最大值是："+max);
        System.out.println("最小值是："+min);
        System.out.println("平均值是："+average);

        Date date = new Date();
        System.out.println(date);
    }
}
