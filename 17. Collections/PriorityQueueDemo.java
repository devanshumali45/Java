import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.peek());   //Top element of queue min for minheap and max for maxheap

        
        q.poll();   //remove head of queue
        
        q.forEach((x)->System.out.println(x));



    }
}
