package LastExamTest.Singleton;

//懒汉式

public class Singletonone {

    private static Singletonone singleton = null;

    public static Singletonone getInstance(){

        if (singleton == null){
            singleton = new Singletonone();
        }
        return singleton;
    }

    public void print(){
        System.out.println("我是懒汉式单例模式");
    }
}
