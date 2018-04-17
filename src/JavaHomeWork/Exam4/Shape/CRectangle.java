package JavaHomeWork.Exam4.Shape;

public class CRectangle extends Cshape {

    private double x;
    private double y;

    public CRectangle(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double GetArea(){
        return x * y;
    }
}
