package JDBC;

import java.sql.*;

public class JDBCTest3 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        //1.�������ݿ�(�ɹ�)
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","123456");
        //2.дsql���(��ѯ����ѧ��)
        //3:ִ�����
        String sql = "INSERT INTO books(bookid,title,author,typeid,price,publisher) VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql); //Ԥ����
        //��ռλ�����ֵ
        statement.setInt(1,3);
        statement.setString(2,"��������ʦ");
        statement.setString(3,"�������ء�������");
        statement.setString(4,"��ƪС˵");
        statement.setString(5,"39.8");
        statement.setString(6,"�ٻ������ճ�����");
        //ִ�����
        int resultSet = statement.executeUpdate();
        statement.close();
        connection.close();
    }
}
