package Arrays;

public class Max_number {
    public static void main(String[] args) {
        int arr[] = {12,45,10,78,99,23,56};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("max number: "+max);
    }
}
