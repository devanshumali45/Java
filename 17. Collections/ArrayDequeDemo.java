import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer>dq=new ArrayDeque<>();

        dq.offerLast(4);
        dq.offerFirst(5);
        dq.offerLast(6);

        System.out.println(dq);

        dq.offerFirst(1);
        dq.offerFirst(2);

        dq.forEach((x)->System.out.println(x));
    }
}
