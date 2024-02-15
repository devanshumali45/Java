

class Super{
    public void display(){
        System.out.println("Hello Super!");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("Hello Sub!");
    }
    public void browse(){
        System.out.println("Hello browse");
    }
}

public class Overriding {
    //Method will call on object not on refernce

    public static void main(String[] args){
        Super su=new Super();
        // su.display();   //Hello Super

        Sub sb=new Sub();
        // sb.display();       //Hello Sub


        //A super class refernce can hold the object of subclass but can call only those methods which are define in superclass. 
        
        Super su2=new Sub();
        su2.display(); //Hello sub
        //su2.browse(); Give error messagebecause browse method is not present in super class

        

        
    }
}
