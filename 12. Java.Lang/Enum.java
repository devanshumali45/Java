enum Dept{
    CS("H1","B1"),IT("H2","B2"),EXT("H3","B3"),CHEM("H4","B4") ; //enum are static and final
    
    String name;
    String Loc;

    //We can declare only private or default constructor
    private Dept(String head,String Loc){
        // System.out.println(this.name());
        name=head;
        this.Loc=Loc;

    }

    public String getName(){
        return name;
    }
    public String getLoc(){
        return Loc;
    }
     
}


public class Enum {
    public static void main(String[] args) {
        Dept d=Dept.EXT;

        System.out.println(d);
        System.out.println(d.ordinal());    //Give index of variable eg. 2
        System.out.println(d.valueOf("IT"));   //IT

        System.out.println(d.getName());

    }
}
