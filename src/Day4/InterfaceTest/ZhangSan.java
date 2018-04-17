package Day4.InterfaceTest;

public class ZhangSan extends Student implements Smoking{


    @Override
    public void somke() {
        System.out.println("zhang san smoke");
    }

    @Override
    void study() {
        System.out.println("zhang san study");
    }
}
