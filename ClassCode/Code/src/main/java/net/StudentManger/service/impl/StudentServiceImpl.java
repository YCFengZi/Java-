package net.StudentManger.service.impl;

import net.StudentManger.dao.StudentDao;
import net.StudentManger.dao.impl.StudentDaoImpl;
import net.StudentManger.domain.Student;
import net.StudentManger.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao = new StudentDaoImpl();

    @Override
    public boolean add(Student student) throws SQLException {
        int num = studentDao.add(student);
        if (num > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean update(int index, Student student) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(int index) throws SQLException {
        return false;
    }

    @Override
    public Student findByName(String nameS) throws SQLException {
        return studentDao.findByName(nameS);
    }

    @Override
    public List<Student> findAll() throws SQLException {
        return null;
    }
}