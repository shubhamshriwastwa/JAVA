 
import java.util.Scanner;
public class AreaOf_Tringle{
    public static void main(String[] args){
        float base,height,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr element");
        base=sc.nextFloat(); 
        height=sc.nextFloat();
        area=1/2 * base * height;
        System.out.println(area);

    }
}