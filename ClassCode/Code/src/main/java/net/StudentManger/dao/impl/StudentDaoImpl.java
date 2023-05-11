package net.StudentManger.dao.impl;

import net.StudentManger.dao.StudentDao;
import net.StudentManger.domain.Student;
import net.StudentManger.utils.JdbcUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    @Override
    public int add(Student student) {
        String sql = "INSERT INTO student(id,name,age,gander,address,birthday) VALUES (?,?,?,?,?,?)";
        Object[] args = {student.getId(),student.getName(),student.getAge(),student.getGander(),student.getAge(),student.getBirthday()};
        int result = template.update(sql,args);
        return result;
    }

    @Override
    public boolean update(int index, Student student) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public Student findByName(String nameS) {
        String sql = "SELECT * FROM student WHERE name = ?";
        Student student = template.queryForObject(sql,new BeanPropertyRowMapper<Student>(Student.class),nameS);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}
