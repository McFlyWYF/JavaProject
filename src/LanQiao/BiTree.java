package LanQiao;

public class BiTree {

    private BiTree l;
    private BiTree r;
    private int n;

    public BiTree(int x){
        n = x;
    }

    public void add(BiTree tree){
        if (tree.n < n){
            if (l == null)
                l = tree;
            else
                l.add(tree);
        }else {
            if (r == null)
                r = tree;
            else
                r.add(tree);
        }
    }

    public void mid_show(){
        if (l != null){
            l.mid_show();
        }
        System.out.println(n);
        if (r != null){
            r.mid_show();
        }
    }
}
