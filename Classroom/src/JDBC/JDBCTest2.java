package JDBC;

import java.sql.*;

public class JDBCTest2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //1.�������ݿ�(�ɹ�)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","123456");
        //2.дsql���(��ѯ����ѧ��)
        //3:ִ�����
        String sql = "INSERT INTO books(bookid,title,author,typeid,price,publisher) VALUES ('2','�ѹ�ӢŮ��','�޲��ء��������֡���','����','25','Simon & Schuste')";
        Statement statement = connection.createStatement();
        int resultSet = statement.executeUpdate(sql);//Ӱ�������
        System.out.println(resultSet);
        statement.close();
        connection.close();
    }
}
