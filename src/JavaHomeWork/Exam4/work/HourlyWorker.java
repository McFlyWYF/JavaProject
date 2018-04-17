package JavaHomeWork.Exam4.work;

import JavaHomeWork.Exam4.work.Employee;

public class HourlyWorker extends Employee {

    private double wage;
    private double hours;

    public HourlyWorker(String firstname,String lastname){
        super(firstname,lastname);
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString(){
        return super.getFirstname()+super.getLastname();
    }

    public double earnings(){
        return wage * hours;
    }
}
