package Arrays;

public class Linear_search {
    public static void main(String[] args) {
        int arr[] = { 45, 12, 89, 10, 2, 99, 78 }; // create array
        int key = 12;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Yes! find it");
                break;
            }
            if(i==arr.length-1)
            {
                System.out.println("oops! not find it");
            }
        }
        
    }
}
// Time Complexity --> O(n)
