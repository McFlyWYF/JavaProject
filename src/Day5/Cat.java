package Day5;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
