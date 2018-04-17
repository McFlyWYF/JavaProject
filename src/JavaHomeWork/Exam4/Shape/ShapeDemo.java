package JavaHomeWork.Exam4.Shape;

public class ShapeDemo {

    public static void main(String[] args) {

        CRectangle r = new CRectangle(2,4);
        System.out.println("正方形的面积是: "+r.GetArea());

        CCricle c = new CCricle(5);
        System.out.println("圆的面积是："+c.GetArea());
    }
}
