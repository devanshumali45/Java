import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamOutputEx {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:/Connecticus/Code/Java/15. IO Stream/sourse.txt");
            String str="WELCOME TO JAVA IO";

            // fos.write(str.getBytes());

            //other method

            byte b[]=str.getBytes();

            for(byte x:b) {
                fos.write(x);     //Output in test.txt=> Welcome to Java Bro
                
            }
            // fos.write(b, 8, str.length()-8);       //Output in test.txt=>to Java Bro




            fos.close();
        } 
        catch(IOException e){
            System.out.println(e);
        }
    }
}
