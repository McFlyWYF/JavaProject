package JavaHomeWork.Exam8;

public class Exam8_1 implements Runnable {

    private String threadname;
    Exam8_1(String threadname){
        this.threadname = threadname;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadname);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread_1 - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stoped " + threadname);
    }
}
