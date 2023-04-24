package JDBC;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //ע�ᣨjdbc��
        // Driver driver = new Driver();
        //DriverManager.registerDriver(driver);
        Class.forName("com.mysql.jdbc.Driver");
        //1.�������ݿ�(�ɹ�)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","123456");
        //2.дsql���(��ѯ����ͼ��)
        String sql = "SELECT * FROM books";
        //3:ִ�����
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        //4�����ؽ��
        System.out.println("��� ���� ���� ���� �۸� ������");
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
