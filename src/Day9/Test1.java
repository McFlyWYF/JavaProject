package Day9;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args){

        /*
        ArrayList a = new ArrayList();

        //添加元素
        a.add(1);
        a.add("java");
        a.add('c');

        //获取个数
        System.out.println(a.size());

        //打印
        System.out.println(a);

        //判断
        System.out.println(a.contains("java"));//判断java是否存在
        System.out.println(a.isEmpty());//判断是否为空

        //删除元素
        a.remove("java");
        System.out.println(a);

        a.clear();//清空集合
        System.out.println(a);
        */

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList b = new ArrayList();
        b.add(1);
        b.add(4);
        b.add(5);

        System.out.println(a.retainAll(b));//取交集,a中只会保存于b中相同的元素
        System.out.println(a);
        System.out.println(b);
    }
}
