import java.io.*;

public class BufferReader {
    
    public static void main(String[] args)throws Exception 
    {
        FileReader fis=new FileReader("Test.txt");
        BufferedReader bis=new BufferedReader(fis);

        System.out.println(fis.markSupported());    //False
        System.out.println(bis.markSupported());    //True
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());


        bis.close();
        
        
    }   
}
