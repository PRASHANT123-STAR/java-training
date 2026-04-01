class ArrayManipulation {

    public static void main(String[] args){

        int a[] = {1,5,4,3,6,8,9,10,13,12};

        int max = 0;
        int secondMax = 0;
        int ThirdMax = 0;

        for(int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                ThirdMax = secondMax;
                secondMax = max;
                max = a[i];
            }
            else if (a[i] > secondMax && a[i] != max) {
                ThirdMax = secondMax;
                secondMax = a[i];
            }
            else  if (a[i] >ThirdMax && a[i] != secondMax && a[i] != max)
            {

                ThirdMax = a[i];

            }
        }
        System.out.println(" Maximum number is: " + max);
        System.out.println("Second Maximum number is: " + secondMax);
        System.out.println("Third Maximum number is: " + ThirdMax);

    }
}