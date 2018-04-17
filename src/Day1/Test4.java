package Day1;

public class Test4 {

    private int age;
    private String name;

    Test4(String name,int age){
        this.name = name;
        this.age = age;
    }

    {
        System.out.println(name+"..."+age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("name= "+name+" age= "+age);
    }

    public static void main(String[] args){

        Test4 test4 = new Test4("Bob",20);
        test4.display();
    }
}
