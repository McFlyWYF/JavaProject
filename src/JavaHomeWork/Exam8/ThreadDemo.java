package JavaHomeWork.Exam8;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Exam8_1());
        //Thread t2 = new Thread(new Exam8_2());

        //t1.setDaemon(true);//设置线程一是守护线程
        //System.out.println(t1.isDaemon());
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程");
            //if (i == 5) {
            //Thread.yield();
            try {
                // t1.join();
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("线程一是否还存在: " + t1.isAlive());
    }
}