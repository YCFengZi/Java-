package JDBC;

import java.sql.*;

public class JDBCTest2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //1.连接数据库(成功)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","123456");
        //2.写sql语句(查询所有学生)
        //3:执行语句
        String sql = "INSERT INTO books(bookid,title,author,typeid,price,publisher) VALUES ('2','蒲公英女孩','罗伯特·富兰克林·杨','爱情','25','Simon & Schuste')";
        Statement statement = connection.createStatement();
        int resultSet = statement.executeUpdate(sql);//影响的行数
        System.out.println(resultSet);
        statement.close();
        connection.close();
    }
}
