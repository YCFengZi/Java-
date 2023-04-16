package collection;

import java.util.*;

public class MyArrayListTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        extracted();
//        extracted1();
        Person[] person = new Person[3];
        ArrayList<Person> list = new ArrayList<Person>();
        for (int i = 0; i < 3; i++) {
            person[i] = new Person(input.next(),input.nextInt(),input.next());
            list.add(person[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }

    private static void extracted1() {
        List list = new ArrayList();
        list.add("王五");
        list.add("老六");
        list.add(1,"吴一凡");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove("吴一凡");
        list.set(1,"六二");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains("王五"));
        System.out.println();
        Collection collection = new ArrayList();
//        System.out.println(collection);
        System.out.println(list);
        System.out.println(collection);
    }

    private static void extracted() {
        ArrayList list = new ArrayList();
        Collection collection = new ArrayList();
        collection.add("张三");
        collection.add("李四");
        System.out.println(collection);
        collection.remove("张三");
        System.out.println(collection);
        System.out.println(collection.contains("李四"));
        Collection c2 = new ArrayList();
        c2.add(1);
        c2.add(2);
//        collection.add(c2);
        collection.addAll(c2);
        System.out.println(collection);
        collection.remove(1);
        System.out.println(collection);
    }
}

class Person {
    private String name;
    private int age;
    private String sex;
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public Person() {}
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", name, age, sex);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(sex, person.sex);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}