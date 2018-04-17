package Day8.ProducerDemo;

public class ProducterCustonDemo {

    public static void main(String[] args){

        Resource res = new Resource();

        Producter p = new Producter(res);
        Consumer c = new Consumer(res);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
