package Day8.Test2;

public class Demo {

    public static void main(String[] args){

        Res r = new Res();

        new Thread(new Input(r)).start();
        new Thread(new Output(r)).start();

//        Input in = new Input(r);
//        Output out = new Output(r);
//
//        Thread t1 = new Thread(in);
//        Thread t2 = new Thread(out);
//
//        t1.start();
//        t2.start();

    }
}
