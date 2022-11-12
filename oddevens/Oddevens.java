/*
 * program meant to enter your name and age and check if your name is odd or even 
 */
package oddevens;

/**
 *importation of scanner
 * 
 */
import java.util.Scanner;
public class Oddevens{
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      /*
      *Declaration of variables String and Integer
      */
      String name;
      int age;
      /*
      *Allows a user to input from their keyboard to the screen
      */
      System.out.println("Enter your name");
      name = sc.next();
      System.out.println("Enter your age ");
      age = sc.nextInt();
      
      System.out.println("Name: " +name );
      System.out.println("Age: " +age);
      /*
      *If Else statement
      */
      if(age%2 ==0){
    System.out.println(age + " is even");}
     else{
     System.out.println(age + " is odd");}
    }
}
