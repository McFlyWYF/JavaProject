package Day8.ProducerDemo;

public class Resource {

    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name){

        while (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.name = name;
        System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name+"---"+count++);
        flag = true;
        this.notifyAll();
    }

    public synchronized void out(){
        while (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        System.out.println(Thread.currentThread().getName()+"...消费者.........."+this.name+"---"+count++);
        flag = false;
        this.notifyAll();
    }
}
