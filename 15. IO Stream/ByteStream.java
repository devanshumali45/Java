import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws Exception {
        
        byte b[]={'a','b','c','d'};

        ByteArrayInputStream in = new ByteArrayInputStream(b);

        /*
        * Reading single char/byte at a time
        int x;

        while((x=in.read())!=-1) System.out.println((char)x);
         */

        //Using byteArray

        String str=new String((in.readAllBytes()));
        // System.out.println(str);

        //Output stream

        ByteArrayOutputStream out = new ByteArrayOutputStream(2); 

        out.write('a');
        out.write('b');
        out.write('c');
        out.write('d');

        byte c[]=out.toByteArray();

        for(byte x:c) System.out.println((char)x);

        out.close();
         

        
        in.close();
    }
}
