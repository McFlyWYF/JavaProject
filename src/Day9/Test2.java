package Day9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

    public static void main(String[] args){
        ArrayList a = new ArrayList();
        a.add("java1");
        a.add("java2");
        a.add("java3");
        a.add("java4");
        a.add("java5");

        ArrayList a1 = new ArrayList();
        a1.add("java2");
        a1.add("java4");
        a1.add("java7");

        System.out.println(a);//输出元素
        a.retainAll(a1);//取交集，a中只保留和a1中相同的元素
        System.out.println(a);
        a.remove("java2");
        System.out.println(a);

        ArrayList a2 = new ArrayList();
        a2.add("java1");
        a2.add("java2");
        a2.add("java3");
        a2.add("java4");
        a2.add("java5");
        Iterator it = a2.iterator();//获取迭代器，用于取出集合中的元素,方法iterator()来获取Iterator对象
        System.out.println(it.next());//迭代输出元素，每次输出一个
        System.out.println(it.hasNext());//如果仍有元素可迭代，返回true
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

        //迭代器就是集合取出元素的方式

    }
}
