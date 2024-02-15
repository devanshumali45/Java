
class Rectangle{
    public int length;
    public int breath;

    public int area(){
        return length*breath;
    }

    public int perimeter(){
        return 2*(length+breath);
    }


}

public class OOPS {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length=5;
        r.breath=10;

        System.out.println(r.area());
        System.out.println(r.perimeter());

        //Data Hiding

        
    }
}
