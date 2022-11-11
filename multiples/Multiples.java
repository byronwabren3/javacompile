/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiples;

/*
 *program to display multiples of 2,3 or 7  within the range 
 * 71 and 150
 */
public class Multiples {

    public static void main(String args[]) {
        /*
        *use for statement to execute the program
        */
        for(int num=71;num<=150;num++){
            /*
            *use if statement and OR(||) to avoid repetition of 
            *variables
            */
      if(num%2==0 || num%3==0 || num%7==0){
          System.out.println(num);
      
    }
        }
    }
}
