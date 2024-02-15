

class Parent{
    public Parent(){
        System.out.println("Parent constructor"); 
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child constructor");
    }
}

public class Constructors {

    public static void main(String[] args){

        Child c=new Child();
        //Output
        //Parent constructor
        //Child constructor
    }
}
