package Arrays;
import java.util.*;
/* Every Element occur twice except one */
public class unique_element {
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,2,4,1};
        int n = arr.length;
        int xor = 0;
        for(int i=0; i<n; i++)
        {
            xor = xor^arr[i];
        }
       System.out.println(xor);

    }
}
