package JDBC.manager.service.impl;

import JDBC.manager.domain.Student;
import JDBC.manager.service.StudentServie;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentServiceImpl implements StudentServie {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean add(Student student) throws SQLException {
        PreparedStatement statement = null;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student", "root", "123456");
        try {
            String sql = "INSERT INTO student(name,age,gander,address,birthday) values(?,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setString(3, student.getGander());
            statement.setString(4, student.getAddress());
            statement.setDate(5, student.getBirthday());
            int n = statement.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    public boolean update(int index, Student student) throws SQLException {
        PreparedStatement statement = null;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student", "root", "123456");
        try {
            String sql = "UPDATE student SET name = ?,age = ?,gander = ?,address = ?,birthday = ? WHERE id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setString(3, student.getGander());
            statement.setString(4, student.getAddress());
            statement.setDate(5, student.getBirthday());
            statement.setInt(6, index);
            int n = statement.executeUpdate();
            if (n > 0) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
    public boolean delete(int index) throws SQLException {
        PreparedStatement statement = null;
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student", "root", "123456");
        try {
            String sql = "DELETE FROM student WHERE id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, index);
            int n = statement.executeUpdate();
            if (n > 0) {
                return true;
            }

        } catch (Exception e) {
            System.out.printf(e.getMessage());
        } finally {
            try {
                statement.close();
                ;
                connection.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return false;
    }

    @Override
    public List<Student> findByName(String nameS) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student", "root", "123456");
        String sql = "SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Student> list = new ArrayList<Student>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String gander = resultSet.getString("gander");
            String address = resultSet.getString("address");
            Date birthday = resultSet.getDate("birthday");
            if (name.equals(nameS)) {
                list.add(new Student(id, name, age, gander, address, (java.sql.Date) birthday));
            }
        }
        return list;
    }

    @Override
    public List<Student> findAll() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/student", "root", "123456");
        String sql = "SELECT * FROM student";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<Student> list = new ArrayList<Student>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String gander = resultSet.getString("gander");
            String address = resultSet.getString("address");
            Date birthday = resultSet.getDate("birthday");
            list.add(new Student(id, name, age, gander, address, (java.sql.Date) birthday));
        }
        return list;
    }
}
