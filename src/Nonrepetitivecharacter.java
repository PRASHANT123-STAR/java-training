 public class Nonrepetitivecharacter {
    public static void main(String args[]){
        String s="abccbhdegdb";

        char[] ch = s.toCharArray();

        String unique ="";
        for(int i=0;i<s.length();i++)
        {
            if(s.indexOf(ch[i]) == s.lastIndexOf(ch[i]))
            {
                unique +=ch[i];
            }
        }

        System.out.println("The non-repetitive character in the given string" + s+" is:" +unique);
    }
}
