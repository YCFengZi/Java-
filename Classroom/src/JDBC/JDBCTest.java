package JDBC;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //注册（jdbc）
        // Driver driver = new Driver();
        //DriverManager.registerDriver(driver);
        Class.forName("com.mysql.jdbc.Driver");
        //1.连接数据库(成功)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","123456");
        //2.写sql语句(查询所有图书)
        String sql = "SELECT * FROM books";
        //3:执行语句
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        //4：返回结果
        System.out.println("编号 书名 作者 类型 价格 出版社");
        while (resultSet.next()){
            int bookId = resultSet.getInt("bookid");
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            String typeId = resultSet.getString("typeid");
            String price = resultSet.getString("price");
            String publisher = resultSet.getString("publisher");
            System.out.println(bookId+" "+title+" "+author+" "+typeId+" "+price+" "+publisher);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
