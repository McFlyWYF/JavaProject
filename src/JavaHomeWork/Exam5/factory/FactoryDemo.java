package JavaHomeWork.Exam5.factory;

public class FactoryDemo {

    public static void main(String[] args) {

        Juice apple = JuiceFactory.createJuice("Apple");
        Juice orange = JuiceFactory.createJuice("Orange");

        apple.getName();
        orange.getName();
    }
}
