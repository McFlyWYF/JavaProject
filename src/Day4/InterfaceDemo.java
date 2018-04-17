package Day4;

public class InterfaceDemo {

    public static void main(String[] args){
        Test test = new Test();
        test.show();
        System.out.println(test.NUM);
        System.out.println(Inter.NUM);
        System.out.println(Test.NUM);
    }
}
