package LanQiao;

//博弈问题，两个人轮流取球，可以取1,3,7,8个球，规定最后一个取到球的人输。

public class Eleven {

    public static boolean f(int n){

        if (n >= 1 && f(n -1) == false)//n:所剩球数目
            return true;
        if (n >= 3 && f(n -3) == false)
            return true;
        if (n >= 7 && f(n -7) == false)
            return true;
        if (n >= 8 && f(n -8) == false)
            return true;
        return false;
    }

    public static void main(String[] args){
        System.out.println(f(10));
    }
}
