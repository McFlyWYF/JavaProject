package LanQiao;

//在n个球中，任意取出m个球(不放回)，共有多少种取法。

public class One {

    public static int f(int n, int m) {

        if (n < m){
            return 0;
        }
        if (n == m){
            return 1;
        }
        if (m == 0) {
            return 1;
        }
            return f(n - 1, m - 1) + f(n - 1, m);//设置一个特殊球，进行划分，第一种包含，第二种不包含。
    }

    public static void main(String[] args) {
       int k = f(3,2);
       System.out.println(k);
    }
}