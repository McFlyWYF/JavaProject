package Day8.Test3;

public class StopThreadDemo {

    public static void main(String[] args){
        StopThread st = new StopThread();

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

//        t1.setDaemon(true);
//        t2.setDaemon(true);

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();

//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        for(int x = 0;x < 80;x++){
            System.out.println("main..."+x);
        }

        System.out.println("over");
//        int num = 0;
//        while (true){
//            if(num++ == 60){
//                st.chage();
//                //t1.interrupt();
//                //t2.interrupt();
//                break;
//            }
//            System.out.println(Thread.currentThread().getName()+"...."+num);
//        }
//        System.out.println("over");
    }
}
