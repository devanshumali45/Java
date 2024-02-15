abstract class Super{
    public int sum=10;
    public Super(){
        System.out.println("Super constructor");
    }

    public void meth1(){
        System.out.println("Super Meth1");
    }

    abstract public void meth2();
     static final void meth3(){
        System.out.println("Original");
     }
}

class Sub extends Super{
    public int sum=20;
    public void meth2(){
        System.out.println("Sub meth2");
    }
    public void meht3(){
        System.out.println("Ovveride");
    }
}

public class Intro {
    public static void main(String[] args){
        //Super s=new Super(); Give error message

        Sub s=new Sub();
        s.meth1();
        s.meth2();

        Super su=new Sub(); //We can create reference of abstract class
        su.meth1();
        su.meth2();
        Sub.meth3();
    }
}
