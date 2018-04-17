package Day8;

public class Bank {

    private int sum;
    Object obj = new Object();

    public synchronized void add(int n) {
        sum = sum + n;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sum= " + sum);
    }
}
