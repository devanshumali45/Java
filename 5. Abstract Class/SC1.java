abstract class Shape{
    abstract public double perimeter();

    abstract public double area();
}

class Circle extends Shape{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double perimeter(){
        return 2*3.14*radius;
    }

    public double area(){
        return 3.14*radius*radius;
    }
}

class Rectangle extends Shape{
    double length;
    double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}
public class SC1 {
    public static void main(String[] args){
        Shape C=new Circle(3);
        Shape R=new Rectangle(3,5);

        

        System.out.println(C.perimeter());
        System.out.println( C.area());
    }
}
