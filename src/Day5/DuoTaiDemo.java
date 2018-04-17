package Day5;

public class DuoTaiDemo {

    public static void function(Animal a){
        //相当于Animal c = new Cat()
        a.eat();

//        if (a instanceof Cat){
//            Cat c = (Cat)a;
//            c.catchMouse();
//        }else {
//            Dog d = (Dog)a;
//            d.kanJia();
//        }
    }

    public static void main(String[] args){

//        Animal c = new Cat();
//        c.eat();//调用子类的eat方法

//        Animal a = new Cat();//类型提升，向上转型
//        a.eat();

        //强制将父类引用转为子类类型，向下转型
//        Cat c = (Cat)a;
//        c.catchMouse();

        function(new Cat());
        function(new Dog());
    }
}
