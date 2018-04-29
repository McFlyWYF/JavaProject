package JavaHomeWork.MidExam.five;

import java.util.Date;

public class PersonDemo {
    public static void main(String[] args) {

        Person p = new Person();
        p.usestart(new Bike());
        p.usestart(new Bus());

        Date date = new Date();
        System.out.println(date);
    }
}
