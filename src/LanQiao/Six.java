package LanQiao;

//m个A，n个B，可以组成多少种不同的排列

public class Six {

    public static int f(int m,int n){

        if (m == 0 || n == 0) return 1;
        return f(m - 1,n) + f(m,n - 1);
    }

    public static void main(String[] args){
        System.out.println(f(3,2));
    }
}
