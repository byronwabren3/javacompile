/*
 *program to find average of 5units in two decimal places 
 */
package averages;

import java.util.Scanner;/*
*importation of the scanner
*/
public class Averages{
    public static void main(String[] args){
        /*
        *declaration of variables
        */
        int num1,num2,num3,num4,num5;
        System.out.println("Enter marks of five units");
        Scanner r = new Scanner(System.in);
        num1 = r.nextInt();
        num2 = r.nextInt();
        num3 = r.nextInt();
        num4 = r.nextInt();
        num5 = r.nextInt();
        
        int sum=num1 + num2 + num3 + num4 + num5;
        System.out.println("Total marks" + sum);
        
        double avg = (sum/5.0);
        System.out.println("Average marks" + avg);
        /*
        *the "%.2f" rounds off the output to two decimal places
        */
        System.out.printf("%.2f",avg);
        
    }
}
