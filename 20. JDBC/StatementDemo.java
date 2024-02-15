import java.sql.*;
import java.util.Scanner;

public class StatementDemo {
        public static void main(String[] args) throws Exception {

            Class.forName("org.sqlite.JDBC");
            Connection con= DriverManager.getConnection("jdbc:sqlite:C://SqlLite//univ.db");

            PreparedStatement stm=con.prepareStatement("select * from student where deptno=?");

            System.out.println("Enter the department number ");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();

            stm.setInt(1,x);

            ResultSet rs= stm.executeQuery();

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
