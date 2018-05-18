package JavaHomeWork.Exam8;

public class Exam8_2 implements Runnable {

    @Override
    public void run() {
        System.out.println("当前线程名字是："+Thread.currentThread().getName());
        Thread.currentThread().setName("线程二");
        System.out.println("改变后的线程名字是："+Thread.currentThread().getName());
        System.out.println("Running " + Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println( Thread.currentThread().getName() + "-----" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stoped " + Thread.currentThread().getName());
    }
}
