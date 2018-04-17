package JavaHomeWork.Exam5.teacher;

public class Common {

    private Teacher teacher;

    public Common(Teacher teacher){
        this.teacher = teacher;
    }

    public void judge1(){
        teacher.judge();
    }
}
