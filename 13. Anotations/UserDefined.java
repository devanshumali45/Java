/** 

@interface MyAnno{

}

@MyAnno //Allow
public class UserDefined {

    @MyAnno
    int x;

    @MyAnno
    public static void main(@MyAnno String[] args) {

        @MyAnno
        int data;
        
    }
}
**/

@interface MyAnno{
    String name();
    String project();
    String date() default "today";  //Not mandotory  
    String version() default "12.5";
}

@MyAnno(name = "Devanshu",project = "Dev",version = "12.7") 
public class UserDefined {

    
    int x;

    
    public static void main(String[] args) {

       
        int data;
        
    }
}


