package IO.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Reader {
    public static void main(String[] args) throws IOException {
        // 经处理后生成学生对象，学生对象存入集合中
        // 遍历集合，输出学生信息
        System.out.println("学号 姓名 年龄");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));//从文件中一次读一行学生信息
        String line = null;
        Set<Student> list = new HashSet<>();
        while ((line = input.readLine()) != null) {
            if (line.equals("exit")) {
                break;
            }
            String[] str = line.split(" ");
            Student student = new Student(str[0],str[1],Integer.parseInt(str[2]));
            list.add(student);
        }
        for (Student s : list) {
            System.out.println(s.toString());
        }
    }
}

class Student {
    private String id;
    private String name;
    private int age;
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

    public Student() {}
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.age;//输出格式
    }
}