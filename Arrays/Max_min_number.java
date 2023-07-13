package Arrays;
public class Max_min_number {
    public static void main(String[] args) {
        
        int arr[] = {-2,45,14,56,120,-78,99,100};
        int size = arr.length;

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        System.out.println("max and min number of the array - "+max+" "+min);

    }
}
