package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Student[] stu = new Student[n];
        StudentManagetool stuManagetool = new StudentManagetool();
        for (int i = 0; i < n; i++) {
            stu[i] = new Student(input.nextInt(),input.next(),input.next(),input.next(),input.nextLine());
            stuManagetool.add(stu[i]);//增加
        }
        String updateName = input.next();
        boolean b = stuManagetool.find(updateName);
        if (b) {
            System.out.println("有此人，可修改");
            int index = stuManagetool.findIndexOf(updateName);
            Student s = stuManagetool.get(index);
            s = new Student(input.nextInt(),input.next(),input.next(),input.next(),input.next());
            stuManagetool.update(index,s);
        } else {
            System.out.println("无此人，无法修改");
        }
        System.out.println(stuManagetool.stuList);
    }
}

class StudentManagetool {
    ArrayList<Student> stuList = new ArrayList<Student>();
    //增加
    public void add(Student stu) {
        stuList.add(stu);
    }
    //删除
    public void delect(int index) {
        stuList.remove(index);
    }
    //修改
    public void update(int index,Student s) {
        stuList.set(index,s);
    }
    //查找
    public boolean find(String name) {
        int i = 0;
        for (i = 0; i < this.stuList.size(); i++) {
            if (this.stuList.get(i).getName().equals(name)) {
                break;
            }
        }
        if (i == this.stuList.size()) {
            return false;
        } else {
            return true;
        }
    }
    public int findIndexOf(String name) {
        int i = 0;
        for (i = 0;i < this.stuList.size();i++) {
            if (this.stuList.get(i).getName().equals(name)) {
                break;
            }
        }
        if (i == this.stuList.size()) {
            return -1;
        } else {
            return i;
        }
    }
    //返回Student实例
    public Student get(int index) {
        return stuList.get(index);
    }
}

class Student {
    private int id;
    private String name;
    private String sex;
    private String phone;
    private String address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {}
    public Student(int id, String name, String sex, String phone, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}