import java.util.*;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer>t=new TreeSet<Integer>(List.of(10,40,23,98,33));
        t.add(25);
        System.out.println(t.ceiling(30));  //33
        System.out.println(t.floor(20)); //10

        System.out.println(t);


    }
}
