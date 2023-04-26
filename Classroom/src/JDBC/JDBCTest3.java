package JDBC;

import java.sql.*;

public class JDBCTest3 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        //1.连接数据库(成功)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","123456");
        //2.写sql语句(查询所有学生)
        //3:执行语句
        String sql = "INSERT INTO books(bookid,title,author,typeid,price,publisher) VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql); //预编译
        //对占位符填充值
        statement.setInt(1,3);
        statement.setString(2,"海上提琴师");
        statement.setString(3,"吉尔伯特·博尔德");
        statement.setString(4,"长篇小说");
        statement.setString(5,"39.8");
        statement.setString(6,"百花洲文艺出版社");
        //执行语句
        int resultSet = statement.executeUpdate();
        statement.close();
        connection.close();
    }
}
