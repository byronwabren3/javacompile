/*
 *program to find largest and smallest values 
 */
package largestsmallest;

import java.util.Scanner;
public class Largestsmallest {
    
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         /*
        *declaration of variables
        */
        int num1;
         int num2;
          int num3;
           int num4;
            int num5;
            int smallest;
            int largest;
       
        System.out.println("Enter the integers separate by space");
        num1 = sc.nextInt();
         num2 = sc.nextInt();
          num3 = sc.nextInt();
           num4 = sc.nextInt();
            num5 = sc.nextInt();
        sc.close();
        smallest = num1;
        /*
        *the IF statement
        */
        if(num2<smallest)
        {
            smallest = num2;
        }
      if(num3<smallest)
        {
            smallest = num3;
        }
      if(num4<smallest)
        {
            smallest = num4;
        }
         if(num5<smallest)
        {
            smallest = num5;
        }
     largest = num1;
      if(num2>largest)
        {
            largest = num2;
        }
     if(num3>largest)
        {
            largest = num3;
        }
     if(num4>largest)
        {
            largest = num4;
        }
        if(num5>largest)
        {
            largest = num5;
        }
    System.out.println("the largest number of the five integer:" + largest);
    System.out.println("the smallest number of the five integer:" + smallest);
    }
}
