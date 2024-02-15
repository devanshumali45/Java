class Constructor{

    private int length;
    private int breath;

    // Non-parameterized constructor or Default constructor
    public Constructor(){
        length=10;
        breath=5;
    }

    //Parameterized constructor
    public Constructor(int l, int b){
        length=l;
        breath=b;
    }
    public static void main(String args[]){
        Constructor r=new Constructor();
    }
}