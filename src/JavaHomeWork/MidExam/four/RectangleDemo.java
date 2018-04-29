package JavaHomeWork.MidExam.four;

import JavaHomeWork.MidExam.four.Rectangle;

import java.util.Date;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(20,16);
        System.out.println("矩形的面积是：" + r.area());
        System.out.println("矩形的周长是：" + r.Rlong());

        Date date = new Date();
        System.out.println(date);
    }
}
