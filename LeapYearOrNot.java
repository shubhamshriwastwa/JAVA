import java.util.*;
public class LeapYearOrNot {
    public static void main(String[] args) {

        int year = 2013;
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("Leap Year");
                }else{
                    System.out.println("not leap year");
                }
            }
            else
            {
                System.out.println("leap year");
            }
        }else
        {
            System.out.println("no leap year");
        }


    }
}