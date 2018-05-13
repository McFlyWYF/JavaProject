package Day10;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

    //去除ArrayList的重复元素

    public static ArrayList singleElement(ArrayList a){

        ArrayList a1 = new ArrayList();

        Iterator it = a.iterator();
        while (it.hasNext()){
            //在迭代循环时，next调用一次，就要hasNext判断一次
            Object obj = it.next();
            if (!a1.contains(obj)){
                a1.add(obj);
            }
        }
        return a1;

    }

    public static void main(String[] args) {
        ArrayList a2 = new ArrayList();
        a2.add('1');
        a2.add('2');
        a2.add('1');
        a2.add('3');
        a2.add('2');

        System.out.println(a2);//[1, 2, 1, 3, 2]

        a2 = singleElement(a2);
        System.out.println(a2);//[1, 2, 3]
    }
}
