package Day8.Test2;

public class Res {

    private String name;
    private String sex;
    private boolean flag = false;

    public synchronized void set(String name,String sex) {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }

    public synchronized void out(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+"   "+sex);
        flag = false;
        this.notify();
    }
}
