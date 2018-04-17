package Day8;

public class ThreadTest {
    public static void main(String[] args){

        Test t1 = new Test("one");
        Test t2 = new Test("two");

        t1.start();
        t2.start();

        //t1.run();
        //t2.run();

        for(int i = 0;i < 100;i++){
            System.out.println("thread run "+i);
        }
    }
}
