package JavaHomeWork.Exam4.Shape;

public class CCricle extends Cshape {

    public static final double PI = 3.14;
    private double r;

    public CCricle(double r){
        this.r = r;
    }

    public double GetArea(){
        return PI * r * r;
    }
}
