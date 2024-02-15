class MyClass{

}

public class ObjectClass {
    public static void main(String[] args) {
        MyClass c=new MyClass();
        MyClass c2=new MyClass();

        System.out.println(c.hashCode());   //Can be override
        System.out.println(c.toString());   //Can be override
        System.out.println(c.equals(c2));   //Can be override

        // equals to give true when 2 refernce points to same objects else return false

        
    }
}
