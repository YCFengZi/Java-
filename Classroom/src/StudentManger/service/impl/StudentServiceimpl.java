package StudentManger.service.impl;

import StudentManger.domain.Student;
import StudentManger.service.StudentService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceimpl implements StudentService {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    } //Á¬½ÓÊý¾Ý¿â

    @Override
    public boolean addStudent(Student student) throws SQLException {
        PreparedStatement statement = null;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student2","root","123456");
        try {
            String sql = "INSERT INTO student(`id`,`name`,`gender`,`age`,`height`) VALUES (?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,student.getId());
            statement.setString(2,student.getName());
            statement.setString(3,student.getGender());
            statement.setInt(4,student.getAge());
            statement.setFloat(5,student.getHeight());
            if (statement.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Ìí¼ÓÊ§°Ü");
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
    @Override
    public boolean updateStudent(int studentId,Student student) throws SQLException {
        PreparedStatement statement = null;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student2","root","123456");
        try {
            String sql = "UPDATE student SET `id`=?,`name`=?,`gender`=?,`age`=?,`height`=? WHERE `id`=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,student.getId());
            statement.setString(2,student.getName());
            statement.setString(3,student.getGender());
            statement.setInt(4,student.getAge());
            statement.setFloat(5,student.getHeight());
            statement.setInt(6,studentId);
            if (statement.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("ÐÞ¸ÄÊ§°Ü");
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
    @Override
    public boolean deleteStudent(int studentId) throws SQLException {
        PreparedStatement statement = null;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student2","root","123456");
        try {
            String sql = "DELETE FROM student WHERE id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,studentId);
            if (statement.executeUpdate() > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("É¾³ýÊ§°Ü");
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
    @Override
    public List<Student> getStudent(int studentId) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student2","root","123456");
        String sql = "SELECT * FROM `student`";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        List<Student> list = new ArrayList<Student>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String gender = resultSet.getString("gender");
            int age = resultSet.getInt("age");
            float height = resultSet.getFloat("height");
            if (id == studentId) {
                list.add(new Student(id,name,gender,age,height));
            }
        }
        return list;
    }
    @Override
    public List<Student> getAllStudent() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student2","root","123456");
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM `student`";
        ResultSet resultSet = statement.executeQuery(sql);
        List<Student> list = new ArrayList<Student>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String gender = resultSet.getString("gender");
            int age = resultSet.getInt("age");
            float height = resultSet.getFloat("height");
            list.add(new Student(id,name,gender,age,height));
        }
        return list;
    }
}
