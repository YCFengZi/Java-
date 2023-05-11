package net.StudentManger.dao.impl;

import net.StudentManger.domain.Student;
import org.junit.Test;
import net.StudentManger.utils.DateUtils;

import java.sql.Date;
import java.sql.SQLException;

public class StudentDaoImplTest {
    @Test
    public void add() throws SQLException {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        Date birthDay = DateUtils.stringToDate("2023-05-09");
        Student student = new Student(3,"空白",18,"男","异世界",birthDay);
        System.out.println(studentDao.add(student));
    }

    public void testTestAdd() {
    }
}