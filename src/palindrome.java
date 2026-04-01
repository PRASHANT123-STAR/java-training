public class palindrome {
    public static void main (String args[])
    {
        String S1="SOS";

        String rev = "";

        for(int i=S1.length()-1;i>=0;i--){
            rev = rev + S1.charAt(i);
        }
        if(S1.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

        System.out.println(rev);

    }

}
