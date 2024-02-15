import java.util.*;

class OddNumberException extends Exception {
    public String toString() {
        return "OddNumberException";
    }
}

public class New {

    static int high(int arr[]){
        int maxi=Integer.MIN_VALUE;

        for(var i:arr){
            if(i>maxi)maxi=i;
        }
        return maxi;
    }

    static void checkNum(int x) throws OddNumberException{
        if(x%2!=0) throw new OddNumberException();
    }
    public static void main(String[] args)  {
        int arr[]=new int[5];

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        // for(int i=0;i<5;i++){
        //     int x=sc.nextInt();
        //     arr[i]=x;
        // }

        // for(var i:arr) System.out.println(i);12
        // System.out.println(high(arr));
        try{

            checkNum(x);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
