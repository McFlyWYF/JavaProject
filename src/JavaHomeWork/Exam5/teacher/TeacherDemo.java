package JavaHomeWork.Exam5.teacher;

public class TeacherDemo {

    public static void main(String[] args) {

        Common c1 = new Common(new JavaTeacher());
        c1.judge1();

        Common c2 = new Common(new DBTeacher());
        c2.judge1();
    }
}
