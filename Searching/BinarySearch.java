package Searching;
// TIME COMPLEXITY --> O(logn)
public class BinarySearch {
    static int binarysearch(int arr[],int s,int e,int t)
    {
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid]==t)
            return mid;
            else if(t>arr[mid])
             s = mid+1;
             else
             e = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,6,12,45,78,89,112,115};
        int n = arr.length;
        int x = 178;
        int res = binarysearch(arr,0,n-1,x);

        if(res==-1)
        {
            System.out.println("target not found");
        }else 
        {
            System.out.println("target found at "+ res);
        }
    }
}
