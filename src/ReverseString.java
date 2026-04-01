public class ReverseString {
    public static void main(String args[]) {
        String S1 = "SPR";

        String rev = "";

        for (int i = S1.length() - 1; i >= 0; i--) {
            rev = rev + S1.charAt(i);

        }
        System.out.println(rev);
    }
}
