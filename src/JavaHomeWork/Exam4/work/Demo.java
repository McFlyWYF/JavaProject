package JavaHomeWork.Exam4.work;

public class Demo {

    public static void main(String[] args) {
       Employee e = new Employee("张","三");
       System.out.println(e.toString());
       System.out.println(e.earnings());

       Worker w = new Worker("李","四");
       w.setSalary(3000);
       w.setCommission(1000);
       w.setQuantity(500);
       System.out.println(w.toString());
       System.out.println(w.earnings());

       HourlyWorker h = new HourlyWorker("王","五");
       h.setHours(5);
       h.setWage(200);
       System.out.println(h.toString());
       System.out.println(h.earnings());
    }
}
