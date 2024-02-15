class Single{
    private int length;
    private int breath;
    static private Single my=null;

    private Single(){   //We make private constructor to limit the number of instances
        length=1;
        breath=0;
    }
    static private int counter=2;
    static Single getInstance(){
        // if(my!=null){
        //     my=new Single();
            
        // }
        if(counter>0){
            my=new Single();
            counter--;
        }
        return my;
    }
}

public class SingleTon {
    public static void main(String[] args){
        Single s1= Single.getInstance();
        Single s2= Single.getInstance();
        Single s3= Single.getInstance();

        if(s1==s2 && s1==s3){   //All the reference are the same
            System.out.println("Same");
        }
        else if(s2==s3){
            System.out.println("2 Same");
        }

    }
}
