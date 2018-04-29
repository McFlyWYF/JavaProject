package JavaHomeWork.MidExam;

import java.util.Date;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        int n = grade / 10;
        switch (n){
            case 10:
                case 9:
                    System.out.println("优");
                    break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }

        Date date = new Date();
        System.out.println(date);
    }
}
