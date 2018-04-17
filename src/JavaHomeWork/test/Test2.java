package JavaHomeWork.test;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a+" "+b);
    }
}
