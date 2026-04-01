public class Array {

    public static void main(String args[]){
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++){   // Fix 1: i=10 → i=0
            System.out.print(a[i]);
        }

        for (int i = a.length-1; i >= 0; i--)  // Fix 2: added 'int'
        {
            System.out.println(a[i]);
        }
    }

}

