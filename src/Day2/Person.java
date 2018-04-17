package Day2;

public class Person {

    //private String name;

    public final int a = 1;

    Person(){
        System.out.println("p1");
    }

    Person(int a){
        System.out.println("p2");
    }
    public final void show(){
        System.out.println(a);
    }
}
