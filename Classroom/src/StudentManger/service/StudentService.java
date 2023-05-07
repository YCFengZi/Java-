package StudentManger.service;

import StudentManger.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {
    public boolean addStudent(Student student) throws SQLException; //添加
    public boolean updateStudent(int studentId,Student student) throws SQLException; //修改
    public boolean deleteStudent(int studentId) throws SQLException; //删除
    public List<Student> getStudent(int studentId) throws SQLException; //获取学生信息
    public List<Student> getAllStudent() throws SQLException; //获取全部学生信息
}
