package Day8.ProducerDemo;

public class Consumer implements Runnable{

    private Resource res;

    Consumer(Resource res){
        this.res = res;
    }

    @Override
    public void run() {
        res.out();
    }
}
