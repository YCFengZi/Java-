package net.StudentManger.ui;

import net.StudentManger.domain.Student;
import net.StudentManger.service.StudentService;
import net.StudentManger.service.impl.StudentServiceImpl;
import net.StudentManger.utils.DateUtils;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class StudentUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        showUI();
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                try {
                    List<Student> studentList = studentService.findAll();
                    for (Student s : studentList) {
                        System.out.println(s);
                    }
                    System.out.println("查询完成");
                } catch (Exception e) {
                    System.out.println("查询失败");
                }
                break;
            case 2:
                try {
                    Student student = null;
                    try {
                        int id = input.nextInt();
                        String name = input.next();
                        int age = input.nextInt();
                        String gander = input.next();
                        String address = input.next();
                        Date birthday = DateUtils.stringToDate(input.next());
                        student = new Student(id,name,age,gander,address,birthday);
                    } catch (Exception e) {
                        System.out.println("格式错误");
                        break;
                    }
                    boolean result = studentService.add(student);
                    if (result) {
                        System.out.println("添加完成");
                    } else {
                        System.out.println("添加失败");
                    }
                } catch (Exception e) {
                    System.out.println("添加失败");
                }
                break;
            case 3:
                try {
                    int index = -1;
                    Student student = null;
                    try {
                        index = input.nextInt();
                        int id = input.nextInt();
                        String name = input.next();
                        int age = input.nextInt();
                        String gander = input.next();
                        String address = input.next();
                        Date birthday = DateUtils.stringToDate(input.next());
                        student = new Student(id,name,age,gander,address,birthday);
                    } catch (Exception e) {
                        System.out.println("格式错误");
                    }
                    boolean result = studentService.update(index,student);
                    if (result) {
                        System.out.println("修改完成");
                    } else {
                        System.out.println("修改失败");
                    }
                } catch (Exception e) {
                    System.out.println("修改失败");
                }
                break;
            case 4:
                try {
                    int index = input.nextInt();
                    boolean result = studentService.delete(index);
                    if (result) {
                        System.out.println("删除完成");
                    } else {
                        System.out.println("删除失败");
                    }
                } catch (Exception e) {
                    System.out.println("删除失败");
                }
                break;
            case 5:
                try {
                    String name = input.next();
                    Student student = studentService.findByName(name);
                    System.out.println(student);
                } catch (Exception e) {
                    System.out.println("查无此人");
                }
                break;
            case 6:
                System.out.println("退出成功");
                break;
            default:
                System.out.println("输出错误");
        }
    }
    private static void showUI() {
        System.out.println("------欢迎进入学生管理系统------");
        System.out.println("请选择功能");
        System.out.println("功能一：查询所有学生信息");
        System.out.println("功能二：添加学生基本信息");
        System.out.println("功能三：修改学生基本信息");
        System.out.println("功能四：删除学生基本信息");
        System.out.println("功能五：查询指定姓名学生");
        System.out.println("功能六：退出系统");
    }
}
