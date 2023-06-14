package Arrays;

public class find_unique_ele {
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,1,4,4,3,5};
        int n = arr.length;

        int ans = 0;

        for(int i=0; i<n; i++)
        {
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}
