package JDBC.manager;

import JDBC.manager.domain.Student;
import JDBC.manager.service.StudentServie;
import JDBC.manager.service.impl.StudentServiceImpl;
import JDBC.manager.utils.DateUtils;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class StudentMangerUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentServie studentServie = new StudentServiceImpl();
        showUI();
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                try {
                    List<Student> studentList = studentServie.findAll();
                    for (Student s : studentList) {
                        System.out.println(s);
                    }
                    System.out.println("��ѯ���");
                } catch (Exception e) {
                    System.out.println("��ѯʧ��");
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
                        System.out.println("��ʽ����");
                        break;
                    }
                    boolean result = studentServie.add(student);
                    if (result) {
                        System.out.println("������");
                    } else {
                        System.out.println("���ʧ��");
                    }
                } catch (Exception e) {
                    System.out.println("���ʧ��");
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
                        System.out.println("��ʽ����");
                    }
                    boolean result = studentServie.update(index,student);
                    if (result) {
                        System.out.println("�޸����");
                    } else {
                        System.out.println("�޸�ʧ��");
                    }
                } catch (Exception e) {
                    System.out.println("�޸�ʧ��");
                }
                break;
            case 4:
                try {
                    int index = input.nextInt();
                    boolean result = studentServie.delete(index);
                    if (result) {
                        System.out.println("ɾ�����");
                    } else {
                        System.out.println("ɾ��ʧ��");
                    }
                } catch (Exception e) {
                    System.out.println("ɾ��ʧ��");
                }
                break;
            case 5:
                try {
                    String name = input.next();
                    List<Student> student = studentServie.findByName(name);
                    if (student.size() == 0) {
                        System.out.printf("���޴���");
                    } else {
                        System.out.println(student);
                    }
                } catch (Exception e) {
                    System.out.println("���޴���");
                }
                break;
            case 6:
                System.out.println("�˳��ɹ�");
                break;
            default:
                System.out.println("�������");
        }
    }
    private static void showUI() {
        System.out.println("------��ӭ����ѧ������ϵͳ------");
        System.out.println("��ѡ����");
        System.out.println("����һ����ѯ����ѧ����Ϣ");
        System.out.println("���ܶ������ѧ��������Ϣ");
        System.out.println("���������޸�ѧ��������Ϣ");
        System.out.println("�����ģ�ɾ��ѧ��������Ϣ");
        System.out.println("�����壺��ѯָ������ѧ��");
        System.out.println("���������˳�ϵͳ");
    }
}
