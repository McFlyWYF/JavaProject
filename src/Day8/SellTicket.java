package Day8;

public class SellTicket implements Runnable {

    private int ticket = 1000;
    Object obj = new Object();
    boolean flag = true;

    @Override
    public void run() {
        if (flag) {
            while (true) {

                synchronized (obj) {
                    show();
//                    if (ticket > 0) {
//                        try {
//                            Thread.sleep(10);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + " sell: " + ticket--);
//                    }
                }
            }
        } else
            while (true) {
                show();
            }
    }

    public synchronized void show() {                           //this
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" sell: "+ticket--);
        }
    }
}


