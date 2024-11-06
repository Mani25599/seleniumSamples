import java.sql.*;

public class Sqlconnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

   Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpractice","root","Root@123");
       Statement statement= connection.createStatement();
     ResultSet resultSet =  statement.executeQuery("select ID,Name from student order by Finalgrade asc limit 15");
    while(resultSet.next()){
        System.out.println("ID"+" "+resultSet.getString(1)+" "+"Name"+" "+resultSet.getString(2)+" "+"Age"+" "+resultSet.getString(1)+" "+"Finalgrade"+" "+resultSet.getString(1));
    }

    }
}
