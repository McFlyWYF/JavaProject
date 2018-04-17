package Day3.TestDemo;

public abstract class Employee {

    private String name;
    private String id;
    private double money;

    Employee(String name,String id,double money){
        this.name = name;
        this.id = id;
        this.money = money;
    }

    public abstract void work();
}
