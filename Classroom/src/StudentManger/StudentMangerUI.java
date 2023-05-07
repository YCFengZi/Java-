package StudentManger;

import StudentManger.domain.Student;
import StudentManger.service.StudentService;
import StudentManger.service.impl.StudentServiceimpl;

import java.util.List;
import java.util.Scanner;

public class StudentMangerUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentService studentService = new StudentServiceimpl();
        showUI();
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                try {
                    Student student = null;
                    try {
                        int id = input.nextInt();
                        String name = input.next();
                        String gander = input.next();
                        int age = input.nextInt();
                        float height = input.nextFloat();
                        student = new Student(id,name,gander,age,height);
                    } catch (Exception e) {
                        System.out.println("格式错误");
                        break;
                    }
                    boolean result = studentService.addStudent(student);
                    if (result) {
                        System.out.println("添加成功");
                    } else {
                        System.out.println("添加失败");
                    }
                } catch (Exception e) {
                    System.out.println("添加失败");
                }
                break;
            case 2:
                try {
                    int studentId = -1;
                    Student student = null;
                    try {
                        studentId = input.nextInt();
                        int id = input.nextInt();
                        String name = input.next();
                        String gander = input.next();
                        int age = input.nextInt();
                        float height = input.nextFloat();
                        student = new Student(id,name,gander,age,height);
                    } catch (Exception e) {
                        System.out.println("格式错误");
                    }
                    boolean result = studentService.updateStudent(studentId,student);
                    if (result) {
                        System.out.println("修改完成");
                    } else {
                        System.out.println("修改失败");
                    }
                } catch (Exception e) {
                    System.out.println("修改失败");
                }
                break;
            case 3:
                try {
                    int studentId = input.nextInt();
                    boolean result = studentService.deleteStudent(studentId);
                    if (result) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败");
                    }
                } catch (Exception e) {
                    System.out.println("删除失败");
                }
                break;
            case 4:
                try {
                    int studentId = input.nextInt();
                    List<Student> students = studentService.getStudent(studentId);
                    if (students.size() == 0) {
                        System.out.println("查无此人");
                    } else {
                        System.out.println(students);
                    }
                } catch (Exception e) {
                    System.out.println("查询失败");
                }
                break;
            case 5:
                try {
                    List<Student> studentList = studentService.getAllStudent();
                    for (Student s : studentList) {
                        System.out.println(s);
                    }
                    System.out.println("查询完成");
                } catch (Exception e) {
                    System.out.println("查询全部失败");
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
        System.out.println("功能一：添加学生信息");
        System.out.println("功能二：修改学生信息");
        System.out.println("功能三：删除学生信息");
        System.out.println("功能四：获取学生信息");
        System.out.println("功能五：获取全部学生信息");
        System.out.println("功能六：退出系统");
    }
}
