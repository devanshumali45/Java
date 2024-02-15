import java.util.Scanner;

public class Loops {
    public static void main (String args[]){
        // int i=0;

        // while(i>=0){
        //     System.out.println(i);
        //     i++;
        // }5

        Scanner sc=new Scanner(System.in);
        // int i=sc.nextInt();
        // double  fact=1;

        // for(int k=1;k<=i;k++){
        //     fact=(fact*=k)%10e+50;
        // }

        // System.out.println(fact);

        // int num=sc.nextInt();

        // int rev=0;


        // while(num>0){
        //     int rem=num%10;
        //     rev=rev*10+rem;
        //     num/=10;
        // }

        // System.out.println(rev);

        // int first=0,second=1,next;

        // System.out.print(first+" ");
        // System.out.print(second+" ");

        // for(int i=2;i<num;i++){
        //     next=first+second;
        //     first=second;
        //     second=next;
        //     System.out.print(next+" ");
        // }

        //Patterns
            // int ct=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){ 
                if(i+j>5) System.out.print("*");
                else
                    System.out.print(" ");
                // ct++;
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){ 
                if(j>i) System.out.print("*");
                else
                    System.out.print(" ");
                // ct++;
            }
            for(int k=1;k<=5-i-1;k++){
                
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
