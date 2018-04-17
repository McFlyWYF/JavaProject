package Day3.Template;

public abstract class GetTime {

    public final void getTime(){

        long start = System.currentTimeMillis();

        runcode();//调用子类的runcode()方法

        long end = System.currentTimeMillis();
        System.out.println("毫秒数为："+(end - start));
    }

    public abstract void runcode();
}
