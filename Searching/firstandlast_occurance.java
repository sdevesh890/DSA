package Searching;

public class firstandlast_occurance {
    static int first_occurance(int arr[],int l,int r,int x)
    {
        int search = 0;
       while(l<=r)
       {
         int mid = l+(r-l)/2;
         if(arr[mid]==x)
         return search = mid;
         else if(x<=arr[mid])
         r = mid-1;
         else 
         l = mid+1;
       }
       return search;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,4,4,7,7,9,9};
        int n = arr.length;
        int x = 9;
        int res = first_occurance(arr, 0, n-1, x);

        System.out.println(res);
    }
}
