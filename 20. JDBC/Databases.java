import java.sql.*;

public class Databases {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://SqlLite//univ.db");

        Statement stm=con.createStatement();

        ResultSet rs= stm.executeQuery("select * from student");

        while(rs.next()){
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");

        }
        stm.close();
        con.close();
    }
}
