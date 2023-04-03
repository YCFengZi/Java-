import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        PersonOverride[] persons1 = new PersonOverride[n1];
        for (int i = 0;i < n1;i++) {
            persons1[i] = new PersonOverride();
        }
        int n2 = input.nextInt();
        int n2Length = 0;
        ArrayList<PersonOverride> list = new ArrayList<PersonOverride>();
        for (int i = 0;i < n2;i++) {
            PersonOverride p = new PersonOverride(input.next(),input.nextInt(),input.nextBoolean());
            if (!(list.contains(p))) {
                n2Length++;
                list.add(p);
            }
        }
        for (PersonOverride p : persons1) {
            System.out.println(p);
        }
        for (Object o : list) {
            PersonOverride p = (PersonOverride) o;
            System.out.println(p);
        }
        System.out.println(n2Length);
        System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
    }
}

class PersonOverride {
    private String name;
    private int age;
    private boolean gender;

    public PersonOverride() {
        this("default",1,true);
    }
    public PersonOverride(String name,int age,boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof  PersonOverride) {
            PersonOverride personOverride = (PersonOverride) o;
            return Objects.equals((this.name),personOverride.name) && this.age == personOverride.age && this.gender == personOverride.gender;
        }
        return false;
    }
    public String toString() {
        return name + "-" + age + "-" + gender;
    }
}