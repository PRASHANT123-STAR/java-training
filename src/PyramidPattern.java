public class PyramidPattern {

    public static void main(String args[])
    {
        int input =5;
        //outer for loop
        for(int i=input; i>=1; i--)
        {
            //To hanlde spaces one inner for loop

            for(int j=1; j<=input-i;j++)
            {
                System.out.print(" ");

            }

            //To handle star one inner for loop
            for(int k=1; k <= (2*i)-1; k++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

}
