package Day8.Test2;

public class Input implements Runnable {

    private Res r;
    Object obj = new Object();

    Input(Res r) {
        this.r = r;
    }

    @Override
    public void run() {
        int x = 0;

        while (true) {
            if (x == 0) {
                r.set("mike", "woman");
            } else {
                r.set("詹姆斯", "男");
                x = (x + 1) % 2;
            }
        }
    }
}
