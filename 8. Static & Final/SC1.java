import java.util.*;
class Student{
    private String rollNo;
    static private int counter=1;

    
    public Student(){
        rollNo="SGGS_2024_"+counter++;
    }
    public String getRollNo() {
        return rollNo;
    }
}


public class SC1 {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s2.getRollNo());
    }
}
