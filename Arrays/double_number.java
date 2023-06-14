package Arrays;

public class double_number {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,8};

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i]*2;
        }
        for(int i=0; i<arr.length; i++)
        System.out.print(arr[i]+" ");
    }
}
