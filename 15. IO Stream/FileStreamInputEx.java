import java.io.FileInputStream;

public class FileStreamInputEx{
    public static void main(String[] args) throws Exception {
        try(FileInputStream fis=new FileInputStream("C:/Connecticus/Code/Java/15. IO Stream/test.txt")){
            /* Read using byte array
             
             byte b[]=new byte[fis.available()];
             fis.read(b);
             String str=new String(b);
             System.out.println(str);
             */

             /*
              * Read using byte by byte 
              */
              int x;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }
        }
    }
}