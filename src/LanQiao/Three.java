package LanQiao;

//求两个串的最大公共子序列的长度

public class Three {

    public static int f(String s1,String s2){

        if(s1.length() == 0 || s2.length() == 0){             //两个串的长度是0
            return 0;
        }

        if (s1.charAt(0) == s2.charAt(0)){                    //两个串的首元素相等，将剩下的元素进行递归
            return f(s1.substring(1),s2.substring(1)) + 1;
        }

        else return Math.max(f(s1.substring(1),s2),f(s1,s2.substring(1))); //两个串的首元素不同，将s1与s2的剩下元素进行比较或者是将s1的剩下元素与s2进行比较。
    }
    public static void main(String[] args){
        int k = f("abc","abecd");
        System.out.println(k);
    }
}
