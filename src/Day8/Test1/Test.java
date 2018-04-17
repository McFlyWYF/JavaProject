package Day8.Test1;

public class Test implements Runnable {

    private boolean flag;

    Test(boolean flag) {
        this.flag = flag;
    }


    @Override
    public void run() {
        if (flag) {
            while (true) {
                synchronized (MyLock.locka) {
                    System.out.println("if locka");
                    synchronized (MyLock.lockb) {
                        System.out.println("if lockb");
                    }
                }
            }
        }else {
            synchronized (MyLock.lockb) {

                System.out.println("else lockb");
                synchronized (MyLock.locka) {
                    System.out.println("else locka");
                }
            }
        }
    }
}
