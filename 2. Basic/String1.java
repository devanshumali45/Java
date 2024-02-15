public class String1 {
    public static void main(String[] args){
        // float a=12.355f;

        // System.out.format("%10.2f",a);

        //1st Constructor
        // char c[]={'A','B','C','D','E','F'};

        // String str=new String(c);   

        // System.out.println(str);

        //2nd Constructor
        
        // byte b[]={'a','b','c','d','e','f'};
        // String str2=new String(b);
        // System.out.println(str2);

        //3rd Constructor

        // String s="New String";  //"New String" is a literal and it occupies space in object pool
        // String str3=new String(s);  //Str3 points to a string s which occupies space in heap 
        // System.out.println(str3);

        //Methods of String

        //1. int length()

        String s="Java";
        int i=s.length();   //4

        //2. String toLowerCase()
        s=s.toLowerCase();  //java

        //3. String toUpperCase()
        s=s.toUpperCase();  //JAVA

        //4.String trim()
        //REmove blanks from string

        //5. String substring(int start)
        String str=s.substring(1);  //AVA

        //6. String substring(int start, int end)
        String str2=s.substring(1,3);//AV return from start to end-1.

        //7. String replace(char old,char new)
        String str3=s.replace('A','Z'); //JZVZ

        //8. boolean startsWith(String s)

        boolean flag=s.startsWith("JA");    //rteurn true or false

        //9. boolean endsWith(String s)
        boolean flag2=s.endsWith("AZ"); //rteurn true or false

        //10. char charAT(int index)

        char a=s.charAt(3); //A

        //11. int indexOf(String s)
        int ix=s.indexOf("A");//1
        int ix2=s.indexOf("A",2);//3 

        //12. int lastIndexOf(String s)
        int ix3=s.lastIndexOf("A");//3
        int ix4=s.lastIndexOf("A",2);//1 

        //13. boolean equals(String s)

        String s1="Java";
        String s2="JavA";

        boolean flag1=s1.equals(s2);    //false

        //14. boolean equalsIgnoreCase(String s)
        flag1=s1.equalsIgnoreCase(s2); //true

        //15. int compareTo(String s)
        int c=s2.compareTo(s1); // Diffenrence between the ASCII values of 2 letters

        String z="Hello";
        String z2="Hello";
        String z1=new String("Hello");

        // if(z==z2) System.out.println("Same");   // Z and z2 are same while Z1 is differnbt from z and z2
        // else System.out.println("Diff");

        //16. String valueOf(int i)
        String st=String.valueOf(3);
        System.out.println(st); 

        String domain="programming@gmail.com";

        int i1=domain.indexOf("@");
        int i2=domain.indexOf(".");

        String ans1=domain.substring(0,i1);
        String ans2=domain.substring(i1+1);

        // System.out.println(ans1);
        // System.out.println(ans2);

        // System.out.println(domain.matches(".*gmail"));

        String bn="101010";
        // System.out.println(bn.matches("[01]+"));

        String hx="AB13";
        // System.out.println(hx.matches("[A-F0-9]*"));

        String f="23/09/2002";
        // System.out.println(f.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

        String f1="abC@#G%12<";
        // System.out.println(f1.replaceAll("[^a-zA-Z0-9]",""));
        

    }
}
