package StudentWork;

/*∞Ê»®À˘”–YCFengZi*/

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");//◊¢≤·
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","123456");//¡¥Ω”
        //÷¥––”Ôæ‰
//        LibraryAdd(input, connection);
//        LibraryDelect(input, connection);
//        LibraryUpdate(input, connection);
//        LibrarySelect(connection);
        connection.close();
    }
    //≤È—Ø
    private static void LibrarySelect(Connection connection) throws SQLException {
        String libSelect = "SELECT * FROM books";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(libSelect);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" "+resultSet.getString(6));
        }
        resultSet.close();
        statement.close();
    }
    //–ﬁ∏ƒ
    private static void LibraryUpdate(Scanner input, Connection connection) throws SQLException {
        String libUpdate = "UPDATE `books` SET bookid = ?,title = ?,author = ?,typeid = ?,price = ?,publisher = ? WHERE bookid = ?";
        PreparedStatement statement = connection.prepareStatement(libUpdate);
        statement.setInt(1, input.nextInt());
        statement.setString(2, input.next());
        statement.setString(3, input.next());
        statement.setString(4, input.next());
        statement.setString(5, input.next());
        statement.setString(6, input.next());
        statement.setInt(7, input.nextInt());
        int result = statement.executeUpdate();
        System.out.println(result);
        statement.close();
    }
    //…æ≥˝
    private static void LibraryDelect(Scanner input, Connection connection) throws SQLException {
        String libDelect = "DELETE FROM books WHERE bookid = ?";
        PreparedStatement statement = connection.prepareStatement(libDelect);//‘§±‡“Î
        statement.setInt(1, input.nextInt());
        int resultSet = statement.executeUpdate();
        System.out.println(resultSet);
        statement.close();
    }
    //≤Â»Î
    private static void LibraryAdd(Scanner input, Connection connection) throws SQLException {
        String libAdd = "INSERT INTO books(bookid,title,author,typeid,price,publisher) VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(libAdd);//‘§±‡“Î
        statement.setInt(1, input.nextInt());
        statement.setString(2, input.next());
        statement.setString(3, input.next());
        statement.setString(4, input.next());
        statement.setString(5, input.next());
        statement.setString(6, input.next());
        int resultSet = statement.executeUpdate();
        System.out.println(resultSet);
        statement.close();
    }
}
