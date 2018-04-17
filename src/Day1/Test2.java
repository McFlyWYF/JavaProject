package Day1;

//this关键字
public class Test2 {

    private String name;
    private int age;

    Test2(String name){
        this.name = name;
    }

    Test2(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("name= "+this.name+" age= "+this.age);
    }

    public static void main(String[] args){

        Test2 test2 = new Test2("Bob");
        Test2 test21 = new Test2("James",20);

        test2.speak();
        test21.speak();
    }
}
