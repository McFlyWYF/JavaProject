package Day8.Test2;

public class Output implements Runnable {

    private Res r;
    Object obj = new Object();

    Output(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {

            r.out();
        }
    }
}
