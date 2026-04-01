public class vowelcount {

        public static void main(String args[])
        {
            String s1 = "Prashanth";

            s1 = s1.toLowerCase();

            int vowelCount = 0;

            char c[] = s1.toCharArray();//
            for(char cr : c)
            {
                if(cr=='a' || cr=='e' || cr=='i'
                        || cr=='o' || cr=='u')
                {
                    vowelCount++;
                }
            }

            System.out.println("The number of vowels present "
                    + "in the given string: "
                    + s1 + "  is " + vowelCount);

        }


}
