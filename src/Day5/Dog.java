package Day5;

public class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("啃骨头");
    }

    public void kanJia(){
        System.out.println("看家");
    }
}
