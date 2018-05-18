package JavaHomeWork.Exam8;

public class Exam8_1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Running " + Thread.currentThread().getName());
        //System.out.println("当前线程名字是："+Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-----" + i);
//                Thread.sleep(1000);
                if (i == 5){
                    Thread.yield();
                    System.out.println("线程暂停");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Stoped " + Thread.currentThread().getName());
    }
}
