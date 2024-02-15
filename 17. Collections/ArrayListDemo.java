import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>v1=new ArrayList<>(10);
        ArrayList<Integer>v2=new ArrayList<>(List.of(5,6,5,8,9));


        v1.add(1);
        v1.add(0,2);
        // v1.addAll(v2);
        v1.addAll(1, v2);
        /* 
        System.out.println(v1.contains(5)); //return true or false wheter 5 is present or not
        System.out.println(v1.get(3));  //7
        System.out.println(v1.indexOf(5));  //returen first occurance 
        System.out.println(v1.lastIndexOf(5));  //retrun last occurance
        v1.set(0,10);   // 2 replace by 10
        System.out.println(v1);
        System.out.println(v2);
        */

        //Iterating through arrayList

        for(int i=0;i<v1.size();i++){
            // System.out.println(v1.get(i));
        }

        // for(Integer x:v1) System.out.println(x);

        //Iterators
        Iterator<Integer>it=v1.iterator();

        // while(it.hasNext()){
        //     // System.out.println(it.next());
        // }

        //Lamda Expressions
        v1.forEach(n->System.out.println(n));

    }
}
