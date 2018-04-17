package LanQiao;

/*
public class Demo {

    public static void main(String[] args) {
        int count = 0;
        int[] a = new int[4];
        for(int i = 1;i < 1000;i++){
            int result = i*i*i;
            char[] arr = String.valueOf(result).toCharArray();
            int sum = 0;
            for(int j = 0;j < arr.length;j++){
                sum = sum+Integer.valueOf(arr[j] - 48);//字符和整数相差48
            }
            if (sum == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
*/

/*
import java.util.Vector;

public class Demo {

    public static int f(int n, int m) {
        n = n % m;
        Vector v = new Vector();

        for (; ; ) {
            v.add(n);
            n *= 10;
            n = n % m;
            if (n == 0) return 0;
            if (v.indexOf(n) >= 0) {
                return v.size();
            }
        }
    }

    public static void main(String[] args) {
        int n = f(1, 3);
        System.out.println(n);
    }
}
*/

/*
public class Demo {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 49; i++) {
            for (int j = i + 2; j < 49; j++) {
                sum = 1225;
                sum = sum - (i + i + 1 + j + j + 1);
                sum = sum + i * (i + 1) + j * (j + 1);
                if (sum == 2015) {
                    System.out.print(i + "+" + j + " ");
                }
            }
        }
    }
}
*/

/*
public class Demo {
    public static void test(int[] x) {
        int a = x[0] * 1000 + x[1] * 100 + x[2] * 10 + x[3];
        int b = x[4] * 10000 + x[5] * 1000 + x[6] * 100 + x[7] * 10 + x[8];
        if (a * 3 == b) System.out.println(a + " " + b);
    }

    public static void f(int[] x, int k) {
        if (k >= x.length) {
            test(x);
            return;
        }

        for (int i = k; i < x.length; i++) {
            {
                int t = x[k];
                x[k] = x[i];
                x[i] = t;
            }
            f(x, k + 1);
            {
                int t = x[k];
                x[k] = x[i];
                x[i] = t;                         // 填空
            }
        }
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        f(x, 0);
    }
}
*/

/*暴力解决
public class Demo {

    public static void main(String[] args) {
        int a[]=new int [13];
        int count=0;
        for(a[0]=0; a[0]<=4; a[0]++)
        {
            for(a[1]=0; a[1]<=4; a[1]++)
            {
                for(a[2]=0; a[2]<=4; a[2]++)
                {
                    for(a[3]=0; a[3]<=4; a[3]++)
                    {
                        for(a[4]=0; a[4]<=4; a[4]++)
                        {
                            for(a[5]=0; a[5]<=4; a[5]++)
                            {
                                for(a[6]=0; a[6]<=4; a[6]++)
                                {
                                    for(a[7]=0; a[7]<=4; a[7]++)
                                    {
                                        for(a[8]=0; a[8]<=4; a[8]++)
                                        {
                                            for(a[9]=0; a[9]<=4; a[9]++)
                                            {
                                                for(a[10]=0; a[10]<=4; a[10]++)
                                                {
                                                    for(a[11]=0; a[11]<=4; a[11]++)
                                                    {
                                                        for(a[12]=0; a[12]<=4; a[12]++)
                                                        {
                                                            if(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9]+a[10]+a[11]+a[12]==13)
                                                            {
                                                                count++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
*/


/*
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = n;
            while (n >= 3) {
                int n1 = n / 3;
                count = count + n1;
                n = n % 3 + n1;
            }
        System.out.println(count);
    }
}
*/

/*
public class Demo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 6;i++){
            for (int j = 1;j <= i;j++){
                sum = sum + j;
            }
        }
        System.out.println(sum);
    }
}
*/

/*
public class Demo {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                sum += j;
                if (sum == 236) {
                    System.out.println(i);
                }
            }
            sum = 0;
        }
    }
}
*/

/*
public class Demo {

    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        for (int e = 1; e <= 9; e++) {
                            for (int f = 1; f <= 9; f++) {
                                for (int g = 1; g <= 9; g++) {
                                    for (int h = 1; h <= 9; h++) {
                                        for (int i = 1; i <= 9; i++) {
                                            if ((a != b && a != c && a != d && a != e && a != f && a != g && a != h && a != i) &&
                                                    (b != c && b != d && b != e && b != f && b != g && b != h && b != i) &&
                                                    (c != d && c != e && c != f && c != g && c != h && c != i) &&
                                                    (d != e && d != f && d != g && d != h && d != i) &&
                                                    (e != f && e != g && e != h && e != i) &&
                                                    (f != g && f != h && f != i) &&
                                                    (g != h && g != i) &&
                                                    (h != i)){
                                                int m = g*100+h*10+i;
                                                int n = d*100+e*10+f;
                                                if (m * a * c + m * b + c* n == 10 * m * c){
                                                    count++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
*/

/*
public class Demo {
    public static String remain(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                s += (char) (i + 'A');
        }
        return s;
    }

    public static void f(String s, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) continue;
            a[i] = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == 1) continue;
                a[j] = 1;
                for (int k = j + 1; k < a.length; k++) {
                    if (a[k] == 1) continue;
                    a[k] = 1;
                    System.out.println(s + " " + (char) (i + 'A') + (char) (j + 'A') + (char) (k + 'A') + " "+remain(a));  //填空位置
                    a[k] = 0;
                }
                a[j] = 0;
            }
            a[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 1;

        for (int b = 1; b < a.length; b++) {
            a[b] = 1;
            for (int c = b + 1; c < a.length; c++) {
                a[c] = 1;
                String s = "A" + (char) (b + 'A') + (char) (c + 'A');
                f(s, a);
                a[c] = 0;
            }
            a[b] = 0;
        }
    }
}
*/

/*
public class Demo {
    public static void f(int[] a, int k, int n, String s) {
        if (k == a.length) {
            if (n == 0) System.out.println(s);
            return;
        }

        String s2 = s;
        for (int i = 0; i <= a[k]; i++) {
            f(a, k + 1, 5 - s2.length(), s2);                                     //填空位置
            s2 += (char) (k + 'A');
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 1, 1, 3};

        f(a, 0, 5, "");
    }
}
*/

/*
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long start = System.currentTimeMillis();
        out:
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    for (int m = 0; m < 1000; m++) {
                        if (i * i + j * j + k * k + m * m == n) {
                            count++;
                            if (count == 1) {
                                System.out.println(i + " " + j + " " + k + " " + m);
                                break out;
                            }
                        }
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
*/

/*
public class Demo {
    static int[] a = new int[9];
    static int[] b = new int[9];
    static int count = 0;

    public static void main(String[] args) {
        search(0);
        System.out.println(count / 6);
    }

    private static void search(int code) {
        if (code == 9) {
            if (a[0] + a[1] + a[2] + a[3] == a[3] + a[4] + a[5] + a[6] && a[3] + a[4] + a[5] + a[6] == a[6] + a[7] + a[8] + a[0]) {
                count++;
            }
            return;
        }
        for (int i = 0; i < 9; i++) {
            if (b[i] == 0) {
                b[i] = 1;
                a[code] = i + 1;
                search(code + 1);
                b[i] = 0;
            }
        }
    }
}
*/

/*
public class Demo {

    static int len(int x) {
        if (x < 10) return 1;
        return len(x / 10) + 1;
    }

    // 取x的第k位数字
    static int f(int x, int k) {
        if (len(x) - k == 0) return x % 10;
        return  f(x/10,k);                                        //填空
    }

    public static void main(String[] args) {
        int x = 23513;
        //System.out.println(len(x));
        System.out.println(f(x, 3));
    }
}
*/

/*
public class Demo{
    static int f(String s1, String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int[][] a = new int[c1.length+1][c2.length+1];

        int max = 0;
        for(int i=1; i<a.length; i++){
            for(int j=1; j<a[i].length; j++){
                if(c1[i-1]==c2[j-1]) {
                    a[i][j] = f(s1.substring(i),s2.substring(i))+1;  //填空
                    if(a[i][j] > max) max = a[i][j];
                }
            }
        }

        return max;
    }

    public static void main(String[] args){
        int n = f("abcdkkk", "baabcdadabc");
        System.out.println(n);
    }
}
*/

/*

import java.util.Scanner;

public class Demo {


    static int[] a = new int[100010];
    static long[] dp = new long[10010];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i, j, k;
        int n = input.nextInt();

        k = input.nextInt();

        long right;
        while (true) {
            dp[0] = 0;
            right = 0;
            for (i = 1; i <= n; i++) {
                a[i] = input.nextInt();
                dp[i] = dp[i - 1] + a[i];
            }

            for (i = 1; i <= n; i++) {
                for (j = 0; j <= n - i; j++) {
                    if ((dp[j + i] - dp[j]) % k == 0) {
                        right++;
                    }
                }
            }
            System.out.println(right);
        }



        int count = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                int sum = 0;
                sum = sum + a[j];
                if (sum %  m== 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

*/

/*
public class Demo {

    private int verxnum;//结点个数
    private char[] vername;//结点名字
    private boolean[] visit;//结点访问标记
    private int[][] arcs;//存储边的信息


    public Demo(int n){
        verxnum = n;
        vername = new char[n];
        arcs = new int[n][n];
        visit = new boolean[n];

        for (int i = 0;i < verxnum;i++){
            for (int j = 0;j < verxnum;j++){
                arcs[i][j] = 0;
            }
        }
    }

    public void addEdge(int i,int j){
        if(i == j){
            return;
        }
        arcs[i][j] = 1;
        arcs[j][i] = 1;
    }

    public void setVerx(char[] vername){
        this.vername = vername;
    }

    public void setVisit(boolean[] visit){
        this.visit = visit;
    }

    public void visit(int i){
        System.out.println(vername[i]);
    }

    private void traverse(int i){
        visit[i] = true;
        visit(i);

        for (int j = 0;j < verxnum;j++){
            if (arcs[i][j] == 1 && visit[i] == false){
                traverse(j);
            }
        }
    }

    public void dfs(){
        for (int i =0;i < verxnum;i++){
            visit[i] = false;
        }

        for (int i = 0;i < verxnum;i++){
            if (visit[i] == false){
                traverse(i);
            }
        }
    }
    public static void main(String[] args) {
        Demo d = new Demo(9);
        char[] vername = {'A','B','C','D','E','F','G','H','I'};
        d.setVerx(vername);

        d.addEdge(0,1);
        d.addEdge(0,3);
        d.addEdge(3,1);
        d.addEdge(5,3);
        d.addEdge(2,4);
        d.addEdge(2,7);
        d.addEdge(4,6);
        d.addEdge(6,8);
        d.addEdge(7,1);
        d.addEdge(1,0);
        d.addEdge(3,0);
        d.addEdge(1,3);
        d.addEdge(3,5);
        d.addEdge(4,2);
        d.addEdge(7,2);
        d.addEdge(6,4);
        d.addEdge(8,6);
        d.addEdge(1,7);


        d.dfs();

    }
}
*/

/*
public class Demo{
    static int a = 1;

    public static int show(){
        a = 2;
        return a;
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(show());
    }
}
*/

/*八皇后问题
public class Demo {
    public int[][] a = new int[8][8];
    int max = 8;
    int count = 0;


    public boolean judge(int a[][], int k, int j) {
        for (int i = 0; i < 8; i++) {
            if (a[i][j] == 1)
                return false;
        }

        for (int i = k - 1, m = j - 1; i >= 0 && m >= 0; i--, m--) {
            if (a[i][m] == 1)
                return false;
        }

        for (int i = k - 1, m = j + 1; i >= 0 && m <= 7; i--, m++) {
            if (a[i][m] == 1)
                return false;
        }
        return true;
    }

    public void find(int i) {
        if (i > 7) {
            count++;
            print();
            return;
        }

        for (int m = 0; m < 8; m++) {
            if (judge(a, i, m)) {
                a[i][m] = 1;
                find(i + 1);
                a[i][m] = 0;
            }
        }
    }

    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (a[i][j] == 1) {
                    System.out.println("皇后"+(i + 1) + "第 " + i + "第 " + j);
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Demo d = new Demo();
        d.find(0);
    }
}
*/

/*
public class Demo{
    public static void main(String[] args) {

        final int N = 1000 * 100;
        int n = 0;
        for (int i = 0;i < N;i++){                  //进行N次计算
            int[] x = new int[365];
            for (int j = 0;j < 30;j++){
                int p = (int) (Math.random() * 365);///产生随机数*365
                if (x[p] == 1){
                    n++;
                    break;
                }else {
                    x[p] = 1;
                }
            }
        }
        double r = (double)n/N;
        System.out.println(r);
    }
}
*/

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int j = 0;
        for (int k = 1000; k < 10000; k++) {

            String s = String.valueOf(k);//将输入的整数转换为字符串
            char[] a = new char[4];//定义字符数组
            for (int i = 3; i >= 0; i--,j++) {
                a[j] = s.charAt(i);//将字符串s中每个元素赋值到字符数组a中
            }
            String s1 = String.valueOf(a);//将字符数组转换为字符串
            if (s1.equals(s)) {
                System.out.println(s1);
            }
        }
    }
}