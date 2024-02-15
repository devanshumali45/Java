class F1{
    final int MAX=1;    //1st
    static final int NORMAL;
    final int MIN;

    static{              //2nd
        NORMAL=2;
    }
    public F1(){        //3rd
        MIN = 1;
    }

    public final void m1(){
        System.out.println("Final Method");
    }
}

class F2 extends F1{
    public void m1(){
        //Error Cannot ovveride final method
    }
}

final class T1{

}
class T2 extends T1{    //Final class cannot be extnded

}

public class Final {
    public static void main(String[] args){

    }
}



