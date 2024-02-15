package Java.Inheritance;


class Circle{
    public double radius;

    public double area(){
        return Math.PI * radius*radius;
    }

    public double circumference(){
        return 2*Math.PI * radius;
    }
}

class Cylinder extends Circle{
    private double height;

    public double area(){
        return 2*Math.PI*radius*(radius + height);
    }
}
public class Inheritance {
    
}
