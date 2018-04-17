package JavaHomeWork.singleton;

public class Singleton1 {

     /*
    懒汉式
     */

    private static Singleton1 s1 = null;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (s1 == null){
            s1 = new Singleton1();
        }
        return s1;
    }

    public void print(){
        System.out.println("我是懒汉式单例模式");
    }
}
