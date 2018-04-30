package Day10;

/*
Set集合的功能和collection的功能一致
Set集合元素无序且不可以重复，无序是指存入和取出的顺序不一致
HashSet底层数据结构是哈希表
TreeSet
*/


import java.util.HashSet;
import java.util.Iterator;

class Person1{
    private String name;
    private int age;

    Person1(String name,int age){
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

    public int hashCode(){
        return 60;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Person1)){
            return false;
        }

        Person1 p1 = (Person1)obj;

        System.out.println(this.name + " " + p1.name);
        return this.name.equals(p1.name) && this.age == p1.age;
    }
}

public class HashSetTest {

    public static void main(String[] args) {
        HashSet hs = new HashSet();

        hs.add(new Person("aa",11));
        hs.add(new Person("bb",12));
        hs.add(new Person("cc",13));
        hs.add(new Person("dd",14));

        Iterator it = hs.iterator();
        while (it.hasNext()){
            Person p = (Person)it.next();
            System.out.println(p.getName()+" "+p.getAge());
        }
    }
}
