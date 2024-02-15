import java.util.*;
/** 
 * @author Devanshu Mali
 * 
 **/
public class BinarySearch {
/**
 * @
 * 
 * */
    static int search(int[] arr,int key){
        int l=0;
        int h=arr.length-1;

        int mid=(l+h)/2;
        while(l<=h){
            if(arr[mid]==key) return mid;

            else if(arr[mid]>key) h=mid-1;

            else l=mid+1;

            mid=(l+h)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,46,22,98,13};

        Arrays.sort(arr);

        // for(int x:arr) System.out.print(x+" ");
        // System.out.println();

        // System.out.println(search(arr, 12));

        String str="Hello, Guys I am MCX.";
        String s[]=str.trim().split("");
        for(String x:s) System.out.print(x+ " "+ x.indexOf(x)+" ");
        
    }
}
