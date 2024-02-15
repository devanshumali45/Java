interface MyLamda{
    void display();
}
//Parameter
interface MyLamda2{
    int add(int a,int b);
}

public class LamdaDemo {
    public static void main(String[] args) {
        MyLamda m=()->{System.out.println("Display");};     //Lamda Expresion
        m.display();

        MyLamda2 mb=(a,b)->{return a+b;};   //Parameters in method
        System.out.println(mb.add(10,20));
    }
}
