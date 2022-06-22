public class Relational {
    public static void main(String args[]) {
        /*
         * int n = -5;
         * if (n > 0) {
         * System.out.println("positive");
         * } else {
         * System.out.println("neegative");
         * }
         */
        int a = 21, b = 3, c = 4;
        if (a > b && a > c) {
            System.out.println(a);

        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

}
