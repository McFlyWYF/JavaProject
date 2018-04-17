package JavaHomeWork.Exam4.work;

public class Employee {

    private String firstname;
    private String lastname;

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String toString() {
        return firstname + lastname;
    }

    public double earnings() {
        return 10000;
    }

}
