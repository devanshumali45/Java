class NegativeDException extends Exception{
    public String toString() {
        return "Negative dimension not allowed";
    }
}


public class UserDefineExceptions {
    static int area(int x,int y) throws NegativeDException 
    {
        if(x<0 || y<0) {
            throw new NegativeDException();
        }
        return x*y;
    }
    static void meth1() throws NegativeDException
    {
        System.out.println(area(10,-5));
    }
    public static void main(String[] args){
        try{

            meth1();
        }
        catch(NegativeDException e){
            System.out.println(e);
        }
    }
}
