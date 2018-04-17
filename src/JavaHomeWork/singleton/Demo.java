package JavaHomeWork.singleton;

public class Demo {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        s1.print();
        System.out.println(s1 == s3);//true

        Singleton1 s2 = Singleton1.getInstance();
        s2.print();

    }
}
