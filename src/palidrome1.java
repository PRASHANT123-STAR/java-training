public class palidrome1 {
    public static void main(String args[]){
        String s1= "Madam";

        //s1= s1.toLowerCase();

        StringBuffer sb = new StringBuffer(s1);

        String rev = sb.reverse().toString();

        if (s1.equalsIgnoreCase(rev)){

            System.out.println("The given String: "+s1
                    +  " is a palidrome");
        }
        else {
            System.out.println("The given String: "+s1
                    +  " is not a palidrome");
        }
    }
}
