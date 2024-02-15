interface Test{
    public static final int sum = 0;
    void meth1();
    void meth2();
    static void meth3(){
        System.out.println("Staic Method");
    }
     

    default void dm(){
        System.out.println("Default Method");
    }
}

class Next implements Test{
    public void meth1(){
        System.out.println("Meth1 of child");
    }
    public void meth2(){
        System.out.println("Meth2 of child");
    }
    public void meth3(){
        System.out.println("Meth3 of child");
    }
    // public void dm(){
    //     System.out.println("Meth4 of child");
    // }
}

public class Intro {
    public static void main(String[] args){
        Test t=new Next();
        // t.dm();
        // Next.meth3();
        // Test.default();
    }
}
