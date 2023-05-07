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
                        System.out.println("��ʽ����");
                        break;
                    }
                    boolean result = studentService.addStudent(student);
                    if (result) {
                        System.out.println("��ӳɹ�");
                    } else {
                        System.out.println("���ʧ��");
                    }
                } catch (Exception e) {
                    System.out.println("���ʧ��");
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
                        System.out.println("��ʽ����");
                    }
                    boolean result = studentService.updateStudent(studentId,student);
                    if (result) {
                        System.out.println("�޸����");
                    } else {
                        System.out.println("�޸�ʧ��");
                    }
                } catch (Exception e) {
                    System.out.println("�޸�ʧ��");
                }
                break;
            case 3:
                try {
                    int studentId = input.nextInt();
                    boolean result = studentService.deleteStudent(studentId);
                    if (result) {
                        System.out.println("ɾ���ɹ�");
                    } else {
                        System.out.println("ɾ��ʧ��");
                    }
                } catch (Exception e) {
                    System.out.println("ɾ��ʧ��");
                }
                break;
            case 4:
                try {
                    int studentId = input.nextInt();
                    List<Student> students = studentService.getStudent(studentId);
                    if (students.size() == 0) {
                        System.out.println("���޴���");
                    } else {
                        System.out.println(students);
                    }
                } catch (Exception e) {
                    System.out.println("��ѯʧ��");
                }
                break;
            case 5:
                try {
                    List<Student> studentList = studentService.getAllStudent();
                    for (Student s : studentList) {
                        System.out.println(s);
                    }
                    System.out.println("��ѯ���");
                } catch (Exception e) {
                    System.out.println("��ѯȫ��ʧ��");
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
        System.out.println("����һ�����ѧ����Ϣ");
        System.out.println("���ܶ����޸�ѧ����Ϣ");
        System.out.println("��������ɾ��ѧ����Ϣ");
        System.out.println("�����ģ���ȡѧ����Ϣ");
        System.out.println("�����壺��ȡȫ��ѧ����Ϣ");
        System.out.println("���������˳�ϵͳ");
    }
}
