package JDBC.manager.service;

import JDBC.manager.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentServie {
    public boolean add(Student student) throws SQLException;//��
    public boolean update(int index,Student student) throws SQLException;//��
    public boolean delete(int index) throws SQLException;//ɾ
    public List<Student> findByName(String nameS) throws SQLException;//��
    public List<Student> findAll() throws SQLException;
}
