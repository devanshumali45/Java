class Product{
    private String itemNo;
    private String name;
    private double price;
    private int qty;

    public String getItemNo(){
        return itemNo;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    public void getProduct(){
        System.out.println("The product is " + itemNo+ " and " + name+ " is " + price);
    }

    public void setPrice(double price){
        price=this.price;
    }
    public void setQty(int qty){
        qty=this.qty;
    }

    public Product(String i, String n){
        itemNo=i;
        name=n;
        price=1000;
        qty=100;
    }
    public Product(String i, String n, double p,int q){
        itemNo=i;
        name=n;
        price=p;
        qty=q;

    }

}

public class Sc1 {
    private double radius;
    private double height;

    public void setRadius(double r) {
        if(r>0) radius = r;
        else radius =0;
    }
    public void setHeight(double h) {
        if(h>0) height = h;
        else height =0;
    }

    public double getRadius() {
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public Sc1(){
        radius=1;
        height=1;
    }

    public Sc1(double r){
        radius=r;
        height=1;
    }
    public Sc1(double radius, double height){
        radius=this.radius;
        height=this.height;
    }

    public static void main(String[] args){
        Product p = new Product("A25","Saop",125,25);
        p.getProduct();
    }
}
