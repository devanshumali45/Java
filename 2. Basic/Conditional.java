import java.util.*;
public class Conditional {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String s=sc.next();

        // if(s.matches("[0-1]+")) System.out.println("2");
        // else if(s.matches("[0-7]+")) System.out.println("8");
        // else if(s.matches("[0-9]+")) System.out.println("10");
        // else if(s.matches("[0-9A-F]+")) System.out.println("16");
        // else System.out.println("Invalid String");


    //     int year=sc.nextInt();

    //     if(year%4==0){
    //         if(year%100==0){
    //             if(year%400==0) System.out.println("Leap Year");
    //             else System.out.println("Not Leap Year");
    //         }
    //         else System.out.println("Leap Year");
    //     }
    //     else System.out.println("Not Leap Year");

        int day=3;

        switch(day) {
            case 1: System.out.println("Monday"); 
                    break;

            case 2: System.out.println("Tuesday");
                    break;

            case 3: System.out.println("Wednesday");
                    break;

            case 4: System.out.println("Thursday");
                    break;

            default: System.out.println("Invalid");

        }
        String domain=sc.next();

        String ext=domain.substring(domain.lastIndexOf("."));

        switch(ext) {
            case ".com": System.out.println("Commercial"); break;
            case ".org": System.out.println("Organization"); break;
            case ".gov": System.out.println("Government"); break;

            default: System.out.println("Invalid");

        }
        int numb=sc.nextInt();
        String n=valueOf(numb);

    


}

}
