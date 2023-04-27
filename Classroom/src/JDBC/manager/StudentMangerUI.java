package JDBC.manager;

import JDBC.manager.domain.Student;
import JDBC.manager.service.StudentServie;
import JDBC.manager.service.impl.StudentServiceImpl;

import java.util.List;

public class StudentMangerUI {
    public static void main(String[] args) {
        StudentServie studentServie = new StudentServiceImpl();
        try {
//            //修改
//            Student student = new Student(2,"李四",18,"男","第三次元",null);
//            Boolean update = studentServie.update(2,student);
//            if (update) {
//                System.out.println("修改成功");
//            } else {
//                System.out.println("修改失败");
//            }
            //删除
//            Boolean delete = studentServie.delete(5);
//            if (delete) {
//                System.out.println("删除成功");
//            } else {
//                System.out.println("删除失败");
//            }
            //查询全部
//            System.out.println(studentServie.findAll());
            //指定查询
//            System.out.println(studentServie.findByName("风子"));
            //添加
//            Student student = new Student(0,"风子",18,"女","第二次元",null);
//            Boolean add = studentServie.add(student);
//            if (add) {
//                System.out.println("添加成功");
//            } else {
//                System.out.println("添加失败");
//            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
