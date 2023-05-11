package net.StudentManger.dao;

import net.StudentManger.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    public int add(Student student) throws SQLException;//增
    public boolean update(int index,Student student) throws SQLException;//改
    public boolean delete(int index) throws SQLException;//删
    public Student findByName(String nameS) throws SQLException;//查
    public List<Student> findAll() throws SQLException;
}
