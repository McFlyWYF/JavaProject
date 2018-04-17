package Day9;

import java.util.*;

public class Test3 {

    public static void main(String[] args){
        /*
        ArrayList a = new ArrayList();
        //添加
        a.add(1);
        a.add(2);
        System.out.println(a);
        //指定位置添加元素
        a.add(1,20);//在指定角标添加元素
        System.out.println(a);
        //删除指定位置元素
        a.remove(2);
        System.out.println(a);
        //修改元素
        a.set(1,10);
        System.out.println(a);
        //通过角标获取元素
        System.out.println(a.get(0));
        //获取所有元素
        for (int i = 0;i < a.size();i++){
            System.out.println(a.get(i));
        }
        //迭代器遍历
        Iterator it = a.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //通过indexOf获取对象角标
        System.out.println(a.indexOf(1));
        //获取指定范围内的元素,包含头，不包含尾
        List sub = a.subList(0,1);
        System.out.println(sub);
        //列表迭代器
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        //ListIterator,列表迭代器
        ListIterator l = a1.listIterator();
        System.out.println(l.hasPrevious());//是否有前一个元素,false
        System.out.println(l.hasNext());//是否有下一个元素,true
        while (l.hasNext()){
            Object obj = l.next();
            if (obj.equals(10)){
                l.add(50);//添加|
            }
        }
        System.out.println(l.hasNext());//false
        System.out.println(l.hasPrevious());//true
        System.out.println(a1);

          ArrayList:底层是数组结构，查询速度快,但是增删较慢，线程不同步。
          LinkedList:底层是链表结构，增删速度快,查询较慢。
          Vector:底层是数组结构，线程同步。被ArrayList替代了。

        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        //枚举就是Vector特有的取出方式,和迭代器类似
        Enumeration en = v.elements();
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        */

        /*
        * addFirst()   addLast()    getFirst()   getLast()    removeFirst()     removeLats()
        */
        LinkedList l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        l.addFirst(0);//头部添加
        l.addLast(6);//尾部添加
        System.out.println(l);
        System.out.println(l.getFirst());//获取头部元素,但不删除元素
        System.out.println(l.removeFirst());//获取元素，但是元素被删除
        System.out.println(l.size());
        while (!l.isEmpty()){
            System.out.println(l.removeFirst());//获取全部元素
        }
    }
}
