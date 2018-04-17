package Day8.Test3;

public class StopThread implements Runnable{
    //private boolean flag = true;

    @Override
    public void run() {

        for(int x = 0;x < 70;x++){
            System.out.println(Thread.currentThread().toString()+"..."+x);
            Thread.yield();
        }
//        while (flag){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName()+"...Exception");
//            }
//            System.out.println(Thread.currentThread().getName()+"----run");
//        }
    }

//    public void chage(){
//        flag = false;
//    }
}
