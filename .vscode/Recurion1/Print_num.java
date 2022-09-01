public class Print_num {
    public static void Print_Numb(int n) {
        if (n == 5) {
            return;
        }

        System.out.println(n);
        Print_Numb(n + 1);

    }

    public static void main(String[] args) {
        int n = 1;
        Print_Numb(n);
    }

}