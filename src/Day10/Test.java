package Day10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add('a');
        a.add('b');
        a.add('c');

        Iterator it = a.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}