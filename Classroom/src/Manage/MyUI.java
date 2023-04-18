package Manage;

import java.util.List;
import java.util.Scanner;

public class MyUI {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Scanner input = new Scanner(System.in);
        while (true) {
            showUI();
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    List<Students> list = studentService.findAll();
                    System.out.println(list);
                    System.out.println("完成查询所有");
                    break;
                case 2:
                    System.out.println("请按顺序依次输入：学号，姓名，年龄，成绩");
                    Students stu2 = new Students(input.next(),input.next(),input.nextInt(),input.nextInt());
                    boolean flag2 = studentService.add(stu2);
                    if (flag2) {
                        System.out.println("完成添加功能");
                    } else {
                        System.out.println("添加失败");
                    }
                    break;
                case 3:
                    System.out.println("请输入要修改的名字：");
                    int index3 = studentService.findIndexOf(input.next());
                    if (index3 == -1) {
                        System.out.println("查无此人，故修改失败");
                    } else {
                        System.out.println("请按顺序依次输入要修改的信息：学号，姓名，年龄，成绩");
                        Students stu3 = new Students(input.next(),input.next(),input.nextInt(),input.nextInt());
                        boolean flag3 = studentService.update(index3,stu3);
                        if (flag3) {
                            System.out.println("完成修改功能");
                        } else {
                            System.out.println("修改失败");
                        }
                    }
                    break;
                case 4:
                    System.out.println("请输入要删除的名字：");
                    int index4 = studentService.findIndexOf(input.next());
                    if (index4 == -1) {
                        System.out.println("查无此人，故无法删除");
                    } else {
                        boolean flag4 = studentService.delect(index4);
                        if (flag4) {
                            System.out.println("完成删除功能");
                        } else {
                            System.out.println("删除失败");
                        }
                    }
                    break;
                case 5:
                    System.out.println("完成充值，恭喜获得大老板");
                    break;
                case 6:
                    System.out.println("退出成功");
                    return;
                default:
                    System.out.println("提示有误，是否继续");
            }
        }
    }

    private static void showUI() {
        System.out.println("------欢迎进入学生管理系统------");
        System.out.println("请选择功能");
        System.out.println("功能一：查询所有学生信息");
        System.out.println("功能二：添加学生基本信息");
        System.out.println("功能三：修改学生基本信息");
        System.out.println("功能四：删除学生基本信息");
        System.out.println("功能五：充值系统");
        System.out.println("功能六：退出系统");
    }
}
