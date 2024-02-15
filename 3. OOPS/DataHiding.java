

class Rectangle{
    int length,breath;

    //Getter & setter

    public int getLength(){
        return length;
    } 

    public int getBreath(){
        return breath;
    }

    public void setLength(int l){
        length = l;
    }

    public void setBreath(int b){
        breath = b;
    }

    public int area(){
        return length*breath;
    }

    public int perimeter(){
        return 2*(length+breath);
    }

}

public class DataHiding {
    public static void main(String[] args){
        Rectangle r=new Rectangle();

        r.setLength(0);
        r.setBreath(5);

        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
