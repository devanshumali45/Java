class Test{
    static{
        System.out.println("Block 1 of Test"); 
    }
    
}

class Test2 extends Test{
    static {
        System.out.println("Block 1 of Test2");
    }
}

public class StaticBlock {
    
    public static void main(String[] args){
        Test t=new Test2();
        System.out.println("Main");
    }
    
}

