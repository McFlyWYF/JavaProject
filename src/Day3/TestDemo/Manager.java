package Day3.TestDemo;

public class Manager extends Employee {

    private int bonus;

    Manager(String name, String id, double money,int bonus) {
        super(name, id, money);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("manager work");
    }
}
