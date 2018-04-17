package Day1;

class Demo{

    int num = 2;

    Demo(){
        System.out.println('a');
    }

    Demo(int a){
        System.out.println('b');
    }

    static {
        System.out.println('c');
    }

    {
        System.out.println('d'+num);
    }
}
public class Test3 {

    public static void main(String[] args){

        new Demo(4);
    }

}
