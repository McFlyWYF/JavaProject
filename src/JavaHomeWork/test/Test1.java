package JavaHomeWork.test;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Spring");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Autumo");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Winter");
                break;
            default:
                System.out.println("输入错误，请重新输入");
                break;
        }
    }
}

