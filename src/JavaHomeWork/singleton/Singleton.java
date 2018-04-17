package JavaHomeWork.singleton;

public class Singleton {
    /*
    饿汉式
     */
    private static Singleton s = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return s;
    }

    public void print(){
        System.out.println("我是饿汉式单例模式");
    }

}
