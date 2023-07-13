package Arrays;

public class Linearsearch {
    public static int search(int arr[],int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==target)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,15,78,21,45,41};
        int target = 141;
        int res = search(arr,target);
        System.out.println(res);
    } 
}
