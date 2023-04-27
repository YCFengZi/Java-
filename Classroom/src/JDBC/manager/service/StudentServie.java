package JDBC.manager.service;

import JDBC.manager.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentServie {
    public boolean add(Student student) throws SQLException;//Ôö
    public boolean update(int index,Student student) throws SQLException;//¸Ä
    public boolean delete(int index) throws SQLException;//É¾
    public List<Student> findByName(String nameS) throws SQLException;//²é
    public List<Student> findAll() throws SQLException;
}
