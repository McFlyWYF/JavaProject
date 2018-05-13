package JavaHomeWork.Exam4.work;

public class Demo {

    public static void main(String[] args) {
       Employee e = new Employee("张","三");
       System.out.println("姓名："+e.toString()+" 工资："+e.earnings());

       Worker w = new Worker("李","四");
       w.setSalary(3000);
       w.setCommission(1000);
       w.setQuantity(500);
       System.out.println("姓名："+w.toString()+" 工资："+w.earnings());

       HourlyWorker h = new HourlyWorker("王","五");
       h.setHours(5);
       h.setWage(200);
       System.out.println("姓名："+h.toString()+" 工资："+h.earnings());
    }
}
