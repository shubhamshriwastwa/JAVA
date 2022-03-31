import java.util.Scanner;
public class Vowel { 
    public static void main(String[] args){
        char ch;
        System.out.println("enter any character");
        Scanner sc=new Scanner(System.in);
         ch=sc.next().charAt(0); 
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("it is vowel");
        } 
        else{ 
            System.out.println("it i conso");
            
        }
        
    }
    
}
