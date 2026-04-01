public class Fibonacciseries {
    public static void main(String args[]){

        int count=1;
        int a= 1;
        int b= 1;
        int c= 0;

        do
        {
            c=a+b;
            System.out.println(c);

            a=b;
            b=c;
            count++;
        } while(count<=10);

    }
}
