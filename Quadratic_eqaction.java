import java.util.Scanner;
public class Quadratic_eqaction{
    public static void main(String args[]){ 
        int a,b,c;
         double r1,r2;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nexInt();
        c=sc.nextInt(); 

        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);  
                r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a); 

        System.out.pritnln("roots of abc" +r1+"  " +r2);


    }
}