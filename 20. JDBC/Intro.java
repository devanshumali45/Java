import java.sql.*;

public class Intro {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:C://SqlLite//univ.db");

        Statement stm=con.createStatement();

        ResultSet rs=stm.executeQuery("select * from dept");

        int dno;
        String name;

        while(rs.next()){
            dno=rs.getInt("deptno");
            name=rs.getString("dname");

            System.out.println(dno+" "+name);
        }
    }
}
