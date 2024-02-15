class Outer{
    int x=10;

    Inner i1=new Inner();   //We can create object of inner class before its defination 
    class Inner{
        int y=20;

        public void innerDisplay(){
            System.out.println("Inner Display "+x+" "+y);
        }

    }

    public void outerDisplay(){
        Inner i=new Inner();
        System.out.println(x+" "+i.y);
    }
}

public class NestedClass {

    public static void main(String[] args){

    
    Outer o=new Outer();

    o.outerDisplay();

    Outer.Inner i1=new Outer().new Inner();
    i1.innerDisplay();
    }
    
}
