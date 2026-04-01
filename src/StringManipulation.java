import java.util.*;
public class StringManipulation {
    public static void main(String args[]) {

        String input = "Hello world";

        input = input.replaceAll("\\s","");

        Map<Character,Integer>Map = new HashMap();

        for (int i=0; i< input.length(); i++) {

            if (!Map.containsKey(input.charAt(i))) {
                Map.put(input.charAt(i), 1);
            } else {
                Map.put(input.charAt(i), Map.get(input.charAt(i)) + 1);
            }
        }
            for (Map.Entry<Character,Integer> entry : Map.entrySet())
            {


                if (entry.getValue()>2)
                {
                    System.out.println(entry.getKey() + ":" + entry.getValue());
                }
            }


    }
}
