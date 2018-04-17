package Day3.TestDemo;

public class Pro extends Employee{

    Pro(String name, String id, double money) {
        super(name, id, money);
    }

    @Override
    public void work() {
        System.out.println("pro work");
    }
}
