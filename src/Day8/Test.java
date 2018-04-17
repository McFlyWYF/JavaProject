package Day8;

public class Test extends Thread {

    private String name;

    Test(String name){
        super(name);
        //this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" test run " + i);
        }
    }
}
