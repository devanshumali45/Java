import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        // int arr[]={1,3,5,17,9};
        // int b[]=new int[5];
        // b=arr;

        // for(int x:b){
        //     System.out.println(x);
        // }

        // int sum=0;

        // Scanner sc=new Scanner(System.in);
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        // }
        // int key=sc.nextInt();

        // for(int x:arr){
        //     if (x==key){
        //         System.out.println(x);
        //         System.exit(0);
        //     }
        // }
        

        // int maxi1=arr[0],maxi2=arr[0];

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>maxi1){
        //         maxi2=maxi1;
        //         maxi1=arr[i];
        //     }
        //     else if(arr[i]>maxi2) maxi2=arr[i];
        // }
        // System.out.println(maxi2);

        //2D Array

        int a[][]=new int[3][4];   //3 rows and 4 columns
        int z=a.length;
        System.out.println(z);
        System.out.println(a[0].length);
        
        int b[][]={{1,2,3,4},{2,3,4,5},{4,5,6,7}};

        // for(int i=0;i<b.length;i++){
        //     for(int j=0;j<b[0].length;j++){
        //         System.out.print(b[i][j]+" ");
        //     }
        //     System.out.print("\n");
        // }

        // for(int x[]:b){
        //     for(int y:x){
        //         System.out.print(y+" ");
        //     }
        //     System.out.print("\n");
        // }

        //Tagged array

        // int A[][];
        // A=new int[3][];
        // A[0]=new int[2];
        // A[1]=new int[4];
        // A[2]=new int[3];

        // for(int i=0;i<A.length;i++){
        //     for(int j=0;j<A[i].length;j++){
        //         System.out.print(A[i][j]+" ");
        //     }
        //     System.out.println("");
        // }

        int a1[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b1[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int[a1.length][b1.length];

        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1[i].length;j++){
                for(int k=0;k<a1.length;k++){
                    c[i][j]=c[i][j]+a1[i][k]*b1[k][j];
                }
            }
        }

        for(int x[]:c){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.print("\n");
        }

        



    }
}
