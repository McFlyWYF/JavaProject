package JavaHomeWork;

import java.util.Scanner;


/*输入一个1-99999之间的数，输出它的位数，并判断是否是回文数
public class Exam3 {
    public static void main(String[] args){
        int j = 0;
        Scanner input =  new Scanner(System.in);
        System.out.println("请随机输入一个1-99999之间的一个数");
        int n = input.nextInt();
        if (n >= 0 && n <= 99999){
            String s = String.valueOf(n);//将输入的整数转换为字符串
            System.out.println("输入数字的位数是: "+s.length());

            char[] a = new char[s.length()];//定义字符数组
            for(int i = s.length() - 1;i >= 0;i--){
                a[j++] = s.charAt(i);//将字符串s中每个元素赋值到字符数组a中
            }
            String s1 = String.valueOf(a);//将字符数组转换为字符串
            if (s1.equals(s)){
                System.out.println("该数字是回文数");
            }else {
                System.out.println("该数字不是回文数");
            }
        }else {
            System.out.println("输入的数字不在指定范围内，请重新输入");
        }
    }
}
*/

//输出200以内的所有奇数
/*
public class Exam3 {
    public static void main(String[] args) {
        int j = 0;
        for(int i = 1;i <= 200;i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                j++;
            } else if (j % 10 == 0){
                System.out.println();
            }
        }
    }
}
*/

//输出下三角的九九乘法表
/*
public class Exam3 {
    public static void main(String[] args) {
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j+"*"+i+"="+j*i+" ");
            }
            System.out.println();
        }
    }
}
*/


//利用二维非矩阵输出
/*
public class Exam3 {
    public static void main(String[] args) {
        int[][] a = {{0}, {1, 2}, {2, 3, 4}, {3, 4, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
*/


//求一组整数数组的最大值，最小值，平均值，所有元素的和
/*
public class Exam3 {

    //最大值
    public int maxNumber(int[] a,int max) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //最小值
    public int minNumber(int[] a,int min) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    //求和
    public float sumAll(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    //平均值
    public float averageAll(int[] a) {
        int sum = 0;
        float average = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        average = sum / a.length;

        return average;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("输入数组的长度：");
        int n = input.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        int max = a[0];
        int min = a[0];

        Exam3 e = new Exam3();
        int maxnumber = e.maxNumber(a,max);
        int minnumber = e.minNumber(a,min);
        float average = e.averageAll(a);
        float sum = e.sumAll(a);
        System.out.println("最大值：" + maxnumber + " 最小值：" + minnumber + " 所有元素的和：" + sum + " 平均值：" + average);
    }
}
*/

//打印字母正三角形

public class Exam3 {
    public static void main(String[] args) {

        for (int i = 1,x = 0; i <= 7; i++,x++) {     //控制空格
            for (int j = 7 - i; j >= 0; j--) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {      //输出字母
                System.out.print((char) ('A' + x) + " ");
            }
            System.out.println();
        }
    }
}
