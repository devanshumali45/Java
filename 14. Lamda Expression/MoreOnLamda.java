//Lamda acess only final variable inside the scope of method, or variables which are never modified.

/**
 * MyLamda
 */
interface MyLamda {
    void display();
    
}

class Demo{
    int ct=0; // Instance Variable => We modify or use in lamda
    public void method1(){
        int fnal=2; // Local variable=> We didi't modify to use in lamda
    MyLamda m=()->{
        int x=10;   //We modify or use in lamda
        System.out.println("Hii");
        System.out.println("The count is " + ++x+" and "+ ++ct+"final "+ fnal);
    };
    m.display();
}
}

public class MoreOnLamda {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.method1();
    }
}
