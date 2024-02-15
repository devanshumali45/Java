

class Parent{
    Parent(){
        System.out.println("Non-Param Constructor");
    }
    Parent(int x){
        System.out.println("Param Constructor "+x);
    }
}

class Child extends Parent{
    Child (){
        System.out.println("Non-Param Constructor");
    }
    Child(int x){
        System.out.println("Param Constructor");
    }

    Child(int x, int y){
        super(x);
        System.out.println("Param Constructor "+y);
    }
}
public class Param {
    public static void main(String[] args){

        Child c=new Child();
        // Output
        //Non-Param Constructor
        //Non-Param Constructor

        Child ch=new Child(10);
        //Non-Param Constructor
        //Param Constructor

        Child chh=new Child(10,20);
        //Param Constructor 10
        //Param Constructor 20

        //this is the reference to current object.
        // Use to avoid name conflicts between parameter and properties. This is use to refer properties

        //super is a refernce to super class
    }
}
