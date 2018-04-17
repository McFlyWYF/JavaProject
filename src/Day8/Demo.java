package Day8;

public class Demo extends Thread {

    @Override
    public void run(){
        for (int i = 0;i < 100;i++)
        System.out.println("thread run"+i);
    }
}
