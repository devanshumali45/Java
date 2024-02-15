import java.io.*;

class Student
{
    int rollno;
    String name;
    float avg;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) throws Exception {

        /*
         * Write to student2.txt
         FileOutputStream fos=new FileOutputStream("student2.txt");
         DataOutputStream dos=new DataOutputStream(fos);
 
         Student s=new Student();
 
         s.rollno=10;
         s.name="Jhon";
         s.avg=80.5f;
         s.dept="CSE";
 
         dos.writeInt(s.rollno);
         dos.writeUTF(s.name);
         dos.writeFloat(s.avg);
         dos.writeUTF(s.dept);
 
         dos.close();
         fos.close();
         */

         //To read from student2.txt
         FileInputStream fis=new FileInputStream("student2.txt");
         DataInputStream dis=new DataInputStream(fis);
 
         Student s=new Student();
 
         s.rollno=dis.readInt();
         s.name=dis.readUTF();
         s.avg=dis.readFloat();
         s.dept=dis.readUTF();


         System.out.println("Roll No "+s.rollno);
         System.out.println("Name "+s.name);
         System.out.println("Avg "+s.avg);
         System.out.println("Dept "+s.dept);
 
         
 
         dis.close();
         fis.close();


    }
}
