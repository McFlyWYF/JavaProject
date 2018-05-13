package Day10;

/*
Set集合的功能和collection的功能一致
Set集合元素无序且不可以重复，无序是指存入和取出的顺序不一致
HashSet底层数据结构是哈希表,HashSet是如何保证元素的唯一性：是通过元素的两个方法，hashCode和equals。
如果元素的hashCode值相同，才会判断equals是否为true
如果元素的hashCode值不同，不会调用equals
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
        return this.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Person1)){
            return false;
        }

        Person1 p1 = (Person1)obj;

        System.out.println(this.name + "----" + p1.name);
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

        System.out.println(hs.contains(new Person("bb",12)));//true
        hs.remove(new Person("cc",13));

        Iterator it = hs.iterator();
        while (it.hasNext()){
            Person p = (Person)it.next();
            System.out.println(p.getName()+" "+p.getAge());
        }
    }
}
