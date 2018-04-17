package Day6;

class Demo {

    private int num;

    Demo(int num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Demo)) {
//            return true;
//        }else {
//            Demo d = (Demo) o;
//            return this.num == d.num;
//        }
//    }
//    public boolean compare(Demo d){
//        return this.num == d.num;
//    }
}

public class ObjectDemo {

    public static void main(String[] args) {
        Demo d1 = new Demo(2);
        Class c = d1.getClass();
        System.out.println(c.getName());
        System.out.println(c.getName()+"@"+Integer.toHexString(d1.hashCode()));
        System.out.println(d1.toString());
        //System.out.println(d1.toString());
//        Demo d2 = new Demo(2);
//        System.out.println(d1.equals(d2));
//        Demo d3 = new Demo();
//        d3 = d1;
//        System.out.println(d1.equals(d2));//比较的是地址值
//        System.out.println(d1.equals(d3));
//        System.out.println(d1 == d3);//比较的是内容
//        System.out.println(d1 == d2);
    }
}
