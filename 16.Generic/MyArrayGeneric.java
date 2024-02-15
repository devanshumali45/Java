class MyArray<T>{
    @SuppressWarnings("unchecked")
    T arr[]=(T[]) new Object[5];
    public int length=0;

    public void append(T v){
        arr[length++]=v;
    }

    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
}

public class MyArrayGeneric {
    public static void main(String[] args) {
        MyArray<Integer> a=new MyArray<>();
        a.append(10);
        a.append(20);
        a.append(30);

        a.display();
    }
}
