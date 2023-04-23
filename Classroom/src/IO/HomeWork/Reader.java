package IO.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Reader {
    public static void main(String[] args) throws IOException {
        // �����������ѧ������ѧ��������뼯����
        // �������ϣ����ѧ����Ϣ
        System.out.println("ѧ�� ���� ����");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));//���ļ���һ�ζ�һ��ѧ����Ϣ
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
        return this.id + " " + this.name + " " + this.age;//�����ʽ
    }
}