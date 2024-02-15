public class Methods {

    int max(int a, int b) {
        if(a>b) return a;

        return b;
    }
    boolean prime(int a){
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0) return false;
        }
        return true;
    } 

    int gcd(int a, int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }

    int maxArray(int arr[]){
        int maxi=0;

        for(int i:arr){
            if(i>maxi) maxi=i;
        }
        return maxi;
    }

    //Variable arguments

    int sum(int ...x){
        int sum=0;
        for(int i:x){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        int a=10,b=20;

        Methods md=new Methods();

        // System.out.println(md.gcd(12,97));
        // int arr[]={2,1,3,2,3};
        // System.out.println(md.maxArray(arr));

        // System.out.println(md.sum(1,1,1,1));

        //In method overloading return type does not matter(Signature) Only number of formal arguments and their type matters

        
        //Command line arguments

        int sum=0;
        for(String x:args){
            sum+=Double.parseDouble(x);
            // System.out.println(x);
        }

        System.out.println((sum));
    }
}
