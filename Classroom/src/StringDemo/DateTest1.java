package StringDemo;

import java.util.Enumeration;
import java.util.Scanner;

public class DateTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String name = input.nextLine();
        String number = input.nextLine();
        String age = input.nextLine();
        stringBuilder.append(name);
        stringBuilder.append(number);
        stringBuilder.append(age);
        stringBuilder.delete(0,5);
        stringBuilder.append("superman");
        System.out.println(stringBuilder);
        Person person = new Person("哥哥","114514","19");
        stringBuilder.append(person);
        System.out.println(stringBuilder);
    }
}

class Person{
    private String name;
    private String number;
    private String age;

    public Person() {}
    public Person(String name, String number, String age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}