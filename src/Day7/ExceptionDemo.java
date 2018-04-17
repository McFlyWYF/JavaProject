package Day7;

public class ExceptionDemo {

    public float div(int a,int b)throws ArithmeticException{
        try {
            if (b == 0){
                System.out.println("除数不能为零");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return a/b;
    }

    public static void main(String[] args){

        ExceptionDemo e = new ExceptionDemo();
        float a = e.div(4,0);
        System.out.println(a);
    }
}
