public class recursion {
    public static void Print_Numb(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        Print_Numb(n - 1);

    }

    public static void main(String[] args) {
        int n = 5;
        Print_Numb(n);
    }

}