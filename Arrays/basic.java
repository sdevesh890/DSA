package Arrays;

public class basic {
    static void arraybasic(int arr[])
    {
          arr[0]+=10;
          System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        //Array Declare
        int arr[] = new int[7];
        String str[] = new String[7];
        Boolean b[] = new Boolean[7];
        char ch[] = new char[7];
        int arr1[] = {12,45,78,45};
        //total memory allocation 7*4 = 28 bytes.
        //store values

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;

        // Array passing as a reference
       arraybasic(arr1);
       System.out.println(arr1[0]);
       


    }
}
