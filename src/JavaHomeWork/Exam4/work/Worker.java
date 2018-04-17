package JavaHomeWork.Exam4.work;

import JavaHomeWork.Exam4.work.Employee;

public class Worker extends Employee {

    private double salary;
    private double commission;
    private int quantity;

    public Worker(String firstname,String lastname) {
        super(firstname,lastname);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return super.getFirstname()+super.getLastname();
    }

    @Override
    public double earnings() {
        return salary+commission+quantity;
    }
}
