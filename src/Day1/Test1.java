package Day1;

//构造代码块
public class Test1 {

    Test1(){
        System.out.println("Day1 Structor");
    }

    Test1(int a){
        System.out.println("Test2 Structor");
    }

    {
        System.out.println("构造代码块");
    }

    public static void main(String[] args){

        Test1 test1 = new Test1();
        Test1 test2 = new Test1(1);
    }
}
