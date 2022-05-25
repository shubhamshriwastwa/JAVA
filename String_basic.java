public class String_basic {
    public static void main(String[] args) {
        String str1 = "shubham";
        String str2 = new String("java");
        System.out.println(str2);
        char c[] = { 's', 'h', 'u', 'b', 'h' };
        String str3 = new String(c, 1, 4);
        System.out.println(str3);
    }

}
