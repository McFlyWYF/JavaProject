package JavaHomeWork.MidExam.four;

public class Rectangle {

    private double width;
    private double height;

    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height;
    }

    public double Rlong(){
        return (width + height) * 2;
    }

}
