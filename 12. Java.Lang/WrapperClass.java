public class WrapperClass {
    public static void main(String[] args) {
        int m=10;
        Integer a=Integer.valueOf(m);   //Boxing
        Integer b=m;                    // AutoBoxing

        Integer c=Integer.valueOf(10);
        int d=c.intValue();             //unboxing
        int e=c;                        //AutoUnboxing


        Integer i=new Integer(10);
        Integer x=Integer.valueOf(10);
        Integer y=10;
        
        Byte z=15;
        Byte s=Byte.valueOf("15");
        
        
        Short f=Short.valueOf("123");
        
        Float g=12.3f;

        
        Double j=Double.valueOf(123.456);
        
        Character k=Character.valueOf('A');
        
        Boolean l=Boolean.valueOf("true");
        
        byte bb=15;
        Byte ef=Byte.valueOf(bb);

        Integer p=10;
        // System.out.println(p.toString());
        StringBuffer st=new StringBuffer("Hello");
        st.reverse();
        // System.out.println(st);
        String s1="New";
        String s2="Hello";
        String s3=s1.format(s2, args);
        System.out.println(s3);



    }
}
