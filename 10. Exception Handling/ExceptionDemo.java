import java.util.Scanner;

class Test{
   
}

public class ExceptionDemo {
    public static void main(String[] args) {

     
        // try{
        // int a=10,b=0;

        // int c=a/b;

        // System.out.println(c);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Try Again");
        // }
        
        //Multiple catch blocks
        // int arr[]={1,2,3,4,0};
        
        // try{
        //     System.out.println(arr[0]/arr[3]);
        //     System.out.println(arr[10]);
            
        // }
        // catch(ArithmeticException t){
        //     System.out.println("Divide by zero error");
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Index Out Of Bounds error");
        // }


        //Nested catch blocks

        int arr[]={10,2,3,4,0};
        
        try{
            System.out.println(arr[0]/arr[3]);
            try{
                System.out.println(arr[10]);
                System.out.println("Hello");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index Out Of Bounds error");
            }
    
        }
        catch(Exception t){
            System.out.println(t.getMessage());
        }
        

        System.out.println("Bye"); 
    }
}
