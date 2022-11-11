package method;
import java.util.Scanner;
/*
 * importation of scanner
 */
public class Leap_year {
	 
    public static void main(String args[]) {
    	/*
    	 * declaration of variable
    	 */
        int year;
        System.out.println("Enter your year");
         Scanner sc = new Scanner(System.in);
       year = sc.nextInt();
       /*
        * If statement
        */
       if(year%4==0)
       {
         System.out.println("leap year");  
       }
       else
       {
           System.out.println("not leap year");
       }
    }
}


