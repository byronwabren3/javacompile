/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadivisibility;

/**
 *
 * @author Admin
 */
public class Javadivisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num;
    
     /*
        *use for statement to execute the program
        */
        for( num=1;num<=9;num++){
            /*
            *use if statement and OR(||) to avoid repetition of 
            *variables
            */
     if(num%5==0)
     {
         System.out.println("Divisible by 5 because it ends with 5");
     }
     else
     {
        System.out.println(" Not Divisible by 5 "); 
     }
        }  
    
        }
}
