package LanQiao;

//杨辉三角第m层第n个元素

import java.util.Scanner;

public class Five {

    public static int f(int m,int n){

        if (n == 0 || m == n)
            return 1;
        return f(m - 1,n) + f(m - 1,n - 1);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int level = in.nextInt();
        for(int i = 0;i <= level;i++){
            System.out.print(f(level,i)+" ");
        }
    }
}
