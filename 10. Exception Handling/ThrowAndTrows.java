public class ThrowAndTrows {

    static int area(int x,int y) throws Exception 
    {
        if(x<0 || y<0) {
            throw new Exception();
        }
        return x*y;
    }
    static void meth1() throws Exception
    {
        System.out.println(area(10,-5));
    }
    public static void main(String[] args){
        try{

            meth1();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
