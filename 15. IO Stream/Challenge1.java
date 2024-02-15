import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;


public class Challenge1 {

    public static void main(String[] args) throws Exception {
        
        FileInputStream fis1=new FileInputStream("sourse.txt");     
        FileInputStream fis2=new FileInputStream("destination.txt");
        FileOutputStream fos2=new FileOutputStream("destination2.txt");

        SequenceInputStream ss=new SequenceInputStream(fis1,fis2);

        int x;
        while((x=ss.read())!=-1) fos2.write((char)x);
            
        
            
            
            fis1.close();
            fis2.close();
            fos2.close();
            ss.close();
        
    }
}


