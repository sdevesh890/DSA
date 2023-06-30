package Searching;

public class LinearSearch {
    static void linearsearch(int arr[],int x)
    {
       boolean flag = false;
       for(int i=0; i<arr.length; i++)
       {
           if(arr[i]==x)
           {
              flag = true;
              break;
           }
       }
       if(flag)
       System.out.println("YES");
       else 
       System.out.println("No");
    }
    public static void main(String[] args) {
        int arr[] = {12,45,4,89,1,2,6};
        int x = 22;
        linearsearch(arr, x);
    }
}
