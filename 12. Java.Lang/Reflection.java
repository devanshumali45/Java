import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.text.DateFormat.Field;

class MyClass{
    private int a;
    public int b;
    protected int c;
    int d;

    public MyClass(){}
    public MyClass(int a,int b){}

    public void show(){

    }
    public void set(){

    }
}


public class Reflection {
    public static void main(String[] args) {
         Class c=MyClass.class;
        
        // Field field[]=c.getDeclaredFields();
        
        Method meth[]=c.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }





    }
}
