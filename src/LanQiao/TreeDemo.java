package LanQiao;

public class TreeDemo {

    public static void main(String[] args){

        BiTree root = new BiTree(100);
        root.add(new BiTree(10));
        root.add(new BiTree(36));
        root.add(new BiTree(115));

        root.mid_show();
    }
}
