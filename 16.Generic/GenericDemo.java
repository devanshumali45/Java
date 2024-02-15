public class GenericDemo<T>{

    @SuppressWarnings("unchecked")
    T data[]=(T[]) new Object[3];

    public static void main(String[] args) {
        System.out.println("Run");
        GenericDemo<String> demo = new GenericDemo<>();

        demo.data[0]="Hi";
        demo.data[1]="Bye";
        // demo.data[2]="10";

        String str=demo.data[0];
        System.out.println(str);

    }
}