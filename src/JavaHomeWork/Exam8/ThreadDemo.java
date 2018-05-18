package JavaHomeWork.Exam8;

public class ThreadDemo {
    public static void main(String[] args) {
      Thread t1 = new Thread(new Exam8_1());
      Thread t2 = new Thread(new Exam8_2());

      t1.start();
//        try {
//            t1.join();//等线程一执行完再执行其他线程
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        t2.start();

      for (int i = 0;i < 5;i++){
          System.out.println("主线程");
      }
        System.out.println("线程一是否还存在: " + t1.isAlive());
    }
}
