package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Students[] students = new Students[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Students(input.next(),input.next(),input.nextInt(),input.nextInt());
        }
        boolean flag = Students.flags(students);
        if (flag) {
            System.out.println("有这个人");
        } else {
            System.out.println("查无此人");
        }
    }
}

class Students {
    private String id;
    private String name;
    private int age;
    private int score;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public static boolean flags(Students[] students) {
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < students.length; i++) {
            map.put(students[i].getId(),students[i].getName());
        }
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> e : entrySet ) {
            if (e.getKey().contains("114514") && e.getValue().contains("张三")) {
                return true;
            }
        }
        return false;
    }

    public Students() {}
    public Students(String id, String name, int age, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}