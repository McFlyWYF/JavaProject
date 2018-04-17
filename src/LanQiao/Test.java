package LanQiao;

import Day4.Inter;

public class Test {

    public static void main(String[] args) {

        /*
        //十进制转化为其他进制
        System.out.println(Integer.toBinaryString(10));//二进制
        System.out.println(Integer.toHexString(10));//十六进制
        System.out.println(Integer.toOctalString(10));//八进制

        //其他进制转化为十进制
        int a = Integer.parseInt("011",8);
        System.out.println(a);
        */

        /*
        int a = 100;
        Integer i1 = new Integer(a);//装箱

        int b = i1.intValue();//拆箱
        */

        Integer i2 = new Integer(10);
        Integer i3 = new Integer(10);
        System.out.println(i2 == i3);
        System.out.println(i2.equals(i3));

        Integer i4 = 200;
        Integer i5 = 200;
        System.out.println(i4 == i5);
        System.out.println(i4.equals(i5));


/*
        System.out.println(Integer.MAX_VALUE);

        int num = Integer.parseInt("12");//将字符串转化为整数
        System.out.println(num + 8);

        boolean a1 = Boolean.parseBoolean("true");
        System.out.println(b);
        */

        /*
        StringBuffer s = new StringBuffer();
        s.append("abc").append(20);
        System.out.println(s);

        s.insert(1,"Hello");
        System.out.println(s);

        s.delete(1,3);//删除指定位置的元素
        System.out.println(s.toString());

        s.setCharAt(2,'E');//修改指定位置的元素
        System.out.println(s);

        StringBuffer s2 = new StringBuffer("abcde");//字符串反转
        s2.reverse();
        System.out.println(s2);

        char[] ch = new char[4];
        s2.getChars(1,4,ch,0);//将缓冲区的指定数据赋值给字符数组
        for (int i = 0;i < ch.length;i++){
            System.out.println(i +" "+ch[i]);
        }
        */

        /*
        String s1 = "---abcd   ";
        int pos = 0;
        int start = 0,end = s1.length() - 1;
            while (s1.charAt(pos) == '-') {
                pos++;
            }
            int x = s1.length() - 1;
            while (s1.charAt(x) == ' ') {
                x--;
            }
        System.out.println(s1.substring(pos,x+1));
        */

        /*
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1.length());//获取字符串的长度
        System.out.println(s1.charAt(2));//获取某个位置的字符
        System.out.println(s1.indexOf('a'));//获取某个字符在字符串中第一次出现的位置，该方法还可以判断是否包含子串
        System.out.println(s1.indexOf('a',1));//从指定位置开始获取某个字符在字符串中出现的位置
        System.out.println(s1.lastIndexOf("a"));//反向索引查找字符最后一次出现的位置
        System.out.println(s1.codePointAt(1));//返回指定索引处字符的ASCII值


        System.out.println(s1.equals(s3));//判断内容是否相同
        System.out.println(s1.equalsIgnoreCase(s3));//判断内容是否相同，并且忽略大小写
        System.out.println(s1.isEmpty());//判断字符串是否为空
        System.out.println(s1.endsWith("ac"));//判断字符串是否以某一字符串结尾，返回的是Boolean型，参数是String
        System.out.println(s1.startsWith("ab"));//判断字符串是否以某一字符串开始
        System.out.println(s1.contains("bce"));//判断字符串是否包含某一子串


        System.out.println();

        System.out.println();
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true

        System.out.println(s1 == s3);//false
        System.out.println(s1.equals(s3));//true

        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);

        //字符数组转化为字符串
        char[] arr = {'a','b','c','d'};
        String s = new String(arr);
        System.out.println(s);

        //将字符串转化为字符数组
        String ss = "abcde";
        System.out.println(ss.toCharArray());

        char[] arr1 = ss.toCharArray();
        for (int i = 0;i < ss.length();i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println(s1.replace("a","Hello"));//字符替换,如果要替换的字符不存在，返回的呼死你原串

        String s5 = "zhang,wang,li";
        String[] arr2 = s5.split(",");//切割字符串，‘，’作为分隔符
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }

        System.out.println(s5.substring(6,10));//获取子串，包含头，不包含尾

        String s6 = "    Hello World";
        System.out.println(s6.toUpperCase());//转换为大写
        System.out.println(s6.toLowerCase());//转换为小写
        System.out.println(s6.trim());//去除两端空格
        System.out.println(s1.compareTo(s6));//字符串顺序比较,字符串大于字符串参数返回大于0的数
        */
    }
}
