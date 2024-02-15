interface Member{
    void callBack();
}

class Store implements Member{

    Member meb[]=new Member[100];
    int count=0;

    public void register(Member m){
        meb[count++]=m;
    }

    public void callBack(){
        for(int i=0;i<count;i++){
            meb[i].callBack();
        }
    }
}

class Customer  implements Member{
    String name;

    public Customer(String name){
        this.name=name;
    }

    public void callBack(){
        System.out.println("I am there "+name);
    }
}
public class SC1 {
    public static void main(String[] args){
        Store s=new Store();
        Customer c1=new Customer("test");
        Customer c2=new Customer("test2");

        s.register(c1);
        s.register(c2);

        s.callBack();
        
    }
}
