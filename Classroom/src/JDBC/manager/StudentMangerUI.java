package JDBC.manager;

import JDBC.manager.domain.Student;
import JDBC.manager.service.StudentServie;
import JDBC.manager.service.impl.StudentServiceImpl;

import java.util.List;

public class StudentMangerUI {
    public static void main(String[] args) {
        StudentServie studentServie = new StudentServiceImpl();
        try {
//            //�޸�
//            Student student = new Student(2,"����",18,"��","������Ԫ",null);
//            Boolean update = studentServie.update(2,student);
//            if (update) {
//                System.out.println("�޸ĳɹ�");
//            } else {
//                System.out.println("�޸�ʧ��");
//            }
            //ɾ��
//            Boolean delete = studentServie.delete(5);
//            if (delete) {
//                System.out.println("ɾ���ɹ�");
//            } else {
//                System.out.println("ɾ��ʧ��");
//            }
            //��ѯȫ��
//            System.out.println(studentServie.findAll());
            //ָ����ѯ
//            System.out.println(studentServie.findByName("����"));
            //���
//            Student student = new Student(0,"����",18,"Ů","�ڶ���Ԫ",null);
//            Boolean add = studentServie.add(student);
//            if (add) {
//                System.out.println("��ӳɹ�");
//            } else {
//                System.out.println("���ʧ��");
//            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
