class template{
    int sum;
    double avg;
    int max;

    template(int sum, double avg, int max){
        this.sum = sum;
        this.avg = avg;
        this.max = max;
    }
}

class User{

    public template result(int []arr){
        int sum=0;
        for(int x:arr) sum+=x;
     
        double avg=(double)sum/arr.length;
        
        int maxi=Integer.MIN_VALUE;
        for(int x:arr) {
            if(x>maxi) maxi=x;
        }
       
       template t=new template(sum, avg, maxi);
       return t;
    }

   
}


public class Bubble {
    public static void main(String[] args) {
        int arr[]={2,5,1,4,2};
        bubble(arr);
        // for(int x:arr) System.out.println(x);
        // System.out.println(high(arr));
        // System.out.println(duplicate("hig"));
        User user=new User();
        

        template result=user.result(arr);

        System.out.println("The sum is "+result.sum);
        System.out.println("The avg is "+result.avg);
        System.out.println("The max is "+result.max);

    }

     static void bubble(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static int high(int[] arr){

        int maxi=arr[0],maxi1=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi1=maxi;
                maxi=arr[i];
            }
            else if( arr[i]>maxi1) maxi1=arr[i];
        }
        return maxi1;
    }

    static boolean duplicate(String str){
        int arr[]=new int[26];

        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-'a';
            if(arr[index]!=0) return false;
            arr[index]++;
        }
        for(int x:arr) System.out.print(x+" ");
        return true;
    }
}
