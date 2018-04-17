package Day5;

public class Pig extends Animal{
    @Override
    void eat() {
        System.out.println("饲料");
    }

    public void gongDi(){
        System.out.println("拱地");
    }
}
