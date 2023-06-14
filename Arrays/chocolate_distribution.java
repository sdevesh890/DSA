package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class chocolate_distribution {
    static int chocodistr(int arr[],int n,int m)
    {
       if(n==0 ||m==0)
       return 0;

       if(n<m)
       return -1;

       int mindiff = Integer.MAX_VALUE;

       for(int i=0; i+m-1<n; i++)
       {
          int diff = arr[i+m-1]-arr[i];
          if(diff<mindiff)
          mindiff = diff;
       }
       return mindiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array values");
        for(int i=0; i<n; i++)
        {
          arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = chocodistr(arr, arr.length,m);
        System.out.println("result :"+res);
    }
}
