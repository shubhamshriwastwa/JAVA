/*Write a Java program to compare two numbers.

Test Data:
Input first integer: 25
Input second integer: 39*/ 
import java.util.Scanner;
public class Compare { 
    
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("enetr first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        
        if(num1==num2){
              System.out.println( "it is equeal");
        } 
        else{
            System.out.println("it  is not equeal");
        }
          
        
    }
  
	}
