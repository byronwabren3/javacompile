//write a program calculator
package calculator;
/*importing of scanner

*/
import java.util.Scanner;
public class Calculators{
    public static void main(String[] args){
        /*declaration of variables
        
        */
        char operator;
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        //program calculator with the operators
        System.out.println("Enter the operator (+,-,*,/)");
        operator = sc.next().charAt(0);
        System.out.println("Enter the two numbers");
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        sc.close();
        //write a java program using switch statement
        switch (operator){
            case'+':
                System.out.printf("%.2f + %.2f = %.2f", num1,num2,(num1 + num2));
                break;
                 case'-':
                System.out.printf("%.2f - %.2% =%.2f", num1,num2,(num1 -num2));
                break;
                 case'*':
                System.out.printf("%.2f * %.2f = %.2f", num1,num2,(num1 * num2));
                break;
                case'/':
                    if(num2!=0)
                System.out.printf("%.2f / %.2f = %.2f", num1,num2,(num1 / num2));
                else
                System.out.println("Divide by zero situation");
                break;
                default:
                System.out.printf("%c is an invalid operator", operator);
        }
    }
}