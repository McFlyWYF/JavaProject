package Day8;


public class SellDemo {

    public static void main(String[] args){

        SellTicket s = new SellTicket();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        Thread t4 = new Thread(s);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
