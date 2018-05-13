package Day10;

import java.util.ArrayList;
import java.util.Iterator;

//List集合判断元素是否相同。依据的是元素的equals方法

class Person{
    private String name;
    private int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Person)){
            return false;
        }

        Person p1 = (Person)obj;

        return this.name.equals(p1.name) && this.age == p1.age;
    }
}

public class ArrayListTest2 {

    //将自定义对象作为元素存到ArrayList集合中，并去除重复元素
    //比如：存人对象，同姓名同年龄，视为同一个人，为重复元素

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new Person("aa",20));
        a1.add(new Person("bb",21));
        a1.add(new Person("bb",21));
        a1.add(new Person("cc",22));
        a1.add(new Person("dd",23));
        a1.add(new Person("dd",23));

        a1 = singleElement(a1);
        Iterator it = a1.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            Person p = (Person)obj;//强转为Person对象
            System.out.println(p.getName()+" "+p.getAge());
        }

        System.out.println(a1.remove(new Person("aa",20)));

        System.out.println(a1);
    }

    public static ArrayList singleElement(ArrayList a){
        ArrayList a1 = new ArrayList();

        Iterator it = a.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if (!a1.contains(obj)){
                a1.add(obj);
            }
        }
        return a1;
    }
}
