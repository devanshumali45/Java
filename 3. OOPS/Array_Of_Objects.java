class Subject{
    private String sid;
    private String name;
    private int maxMark;
    private int marksObtain;

    public String toString() {
        return "Subject id is " + sid + ", \nname is " + name+ "\nmax marks are " + maxMark+ "\n";
    }

    public Subject(String sid,String name,int marksObtain){
        this.sid = sid;
        this.name = name;
        maxMark=100;
        this.marksObtain=marksObtain;
    }

}

class Student {
    private int rollNumber;
    private String name;
    private String department;
    private Subject[] subjects; // Array of Subject objects

    // Constructor
    public Student(int rollNumber, String name, String department, Subject[] subjects) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
        this.subjects = subjects;
    }

    // Getter and setter methods
    public int getRollNumber() {
        return rollNumber;
    }


    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }


    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Student Details:\n");
        result.append("Roll Number: ").append(rollNumber).append("\n");
        result.append("Name: ").append(name).append("\n");
        result.append("Department: ").append(department).append("\n");
        result.append("Subjects:\n");
        for (Subject subject : subjects) {
            result.append(subject.toString());
        }
        return result.toString();
    }


}
public class Array_Of_Objects {
    public static void main(String[] args){
        Subject subs[]=new Subject[3];  // array of objects subs pointing to the array of size 3 contain the refernce of the ctual objects
        subs[0]=new Subject("101","DS",75);
        subs[1]=new Subject("102","Algorithms",80);
        subs[2]=new Subject("103","OS",60);

        // for(Subject s:subs){
        //     System.out.println(s);
        // }

         // Creating a Student object with the array of subjects
         Student student = new Student(123, "John Doe", "Computer Science", subs);

         // Printing the details of the Student object
         System.out.println(student);
    }
}
