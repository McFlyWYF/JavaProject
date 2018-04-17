package Day8.ProducerDemo;

public class Producter implements Runnable{

    private Resource res;

    Producter(Resource res){
        this.res = res;
    }

    @Override
    public void run() {
        while (true){
            res.set("手机...");
        }
    }
}
