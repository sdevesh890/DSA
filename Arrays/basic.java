package Arrays;

import java.util.Scanner;

public class basic {
    public static void main(String args[])
    {
        // Declaration
        int arr[] = new int[5];
        System.out.println("Array cretaed Successful");
         
        // initialization
        int brr[] = {1,2,3,4,5};
        System.out.println("Array initialised Successfully");
        
        // index and access
        System.out.println(brr[0]);
        System.out.println(brr[2]);
        // System.out.println(brr[5]);  --> give error

        // input of array
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();
        }
          // printing all values
        for(int i=0; i<brr.length; i++)
        System.out.print(arr[i]+" ");
    }
} 