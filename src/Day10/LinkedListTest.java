package Day10;

import java.util.LinkedList;

//使用LinkedList模拟一个堆栈或者队列
public class LinkedListTest {

    private LinkedList link;

    LinkedListTest(){
        link = new LinkedList();
    }

    public void myadd(Object obj){
        link.addFirst(obj);
    }

    public Object myget(){
        return link.removeLast();
    }

    public boolean isNull(){
        return link.isEmpty();
    }

    public static void main(String[] args) {
        //堆栈:先进后出
        //队列:先进先出

        LinkedListTest l = new LinkedListTest();
        l.myadd('1');
        l.myadd('2');
        l.myadd('3');

        while (!l.isNull()) {
            System.out.println(l.myget());
        }
    }
}
