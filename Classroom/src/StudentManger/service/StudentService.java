package StudentManger.service;

import StudentManger.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student) throws SQLException; //���
    public boolean updateStudent(int studentId,Student student) throws SQLException; //�޸�
    public boolean deleteStudent(int studentId) throws SQLException; //ɾ��
    public List<Student> getStudent(int studentId) throws SQLException; //��ȡѧ����Ϣ
    public List<Student> getAllStudent() throws SQLException; //��ȡȫ��ѧ����Ϣ
}
