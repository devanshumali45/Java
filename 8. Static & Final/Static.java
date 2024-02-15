class Test{
    static int x=10;
    int y=20;


    public void m1(){
        System.out.println(x+" "+y+" ");    //Acess static as well as Non-static variables
    }

    static void m2(){
        System.out.println(x);      //Acess only static variables
    }


}

public class Static {
    public static void main(String[] args){
        Test t=new Test();
        t.m1();

        t.x=100;
        t.y=200;

        Test t2=new Test();
        t2.m1();
    }
}
