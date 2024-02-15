import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DMLDemo {
    public static void main(String[] args) throws Exception {


        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://SqlLite//univ.db");

        Statement stm = con.createStatement();

       stm.executeUpdate("insert into dept values(60,'Chem')"); //Adding row

//        stm.executeQuery("delete from dept where deptno=50" );

        stm.close();
        con.close();

    }
}
