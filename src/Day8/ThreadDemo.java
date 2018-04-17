package Day8;

public class ThreadDemo {

    public static void main(String[] args){
//        for(int i = 0;i < 100;i++)
//        System.out.println("Hello World");

        Demo d = new Demo();
        //d.start();//开启线程，并执行线程
        d.run();//仅仅是执行run方法

        for(int i = 0;i < 100;i++)
            System.out.println("demo run"+i);
    }
}
