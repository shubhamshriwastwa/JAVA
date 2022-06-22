import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String a[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }
        sc.close();

    }

}