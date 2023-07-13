package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class intersection_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,7,8};
        int brr[] = {7,8,1,2,1};
        int n1 = arr.length;
        int n2 = brr.length;

        Arrays.sort(arr);
        Arrays.sort(brr);
        ArrayList<Integer>list= new ArrayList<>();
        int i=0; 
        int j=0;
        
        while(i<n1 && j<n2)
        {
            if(arr[i]==brr[j])
            {
                if(!list.contains(arr[i]))
                {
                    list.add(arr[i]);
                }
                i++;
                j++;

            }
            if(arr[i]<brr[j])
            {
                i++;
            }else 
            {
                j++;
            }
        }
        for( i=0; i<list.size(); i++)
        System.out.print(list.get(i)+" ");
    }
}
