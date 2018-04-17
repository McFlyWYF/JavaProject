package JavaHomeWork.test;

import java.util.Arrays;

public class Test6 {

    protected int a;
    public static void main(String[] args) {

        int[] a = {1,3,6,9,2,4,6,7,8,0};
        int[] b = {1,3,6,9,2,4,6,7,8,0};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        char[] ch = {'b','c','e','a','d'};
        Arrays.parallelSort(ch);
        System.out.println(Arrays.toString(ch));
    }
}
