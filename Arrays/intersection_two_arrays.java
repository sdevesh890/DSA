package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class intersection_two_arrays {
    public static void main(String[] args) {

        int nums1[] = {2,3,4,89,1,56};
        int nums2[] = {5,4,89,44,10,3};

        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashSet<Integer> arr = new HashSet<>();
        while(i<nums1.length  && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                arr.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j])
            {
                i++;
            }else 
            {
                j++;
            }
        }
        int res[] = new int[arr.size()];
        int k=0;
        for(int n:arr)
        {
            res[k++] = n;
            
        }

        for(int n=0; n<res.length; n++)
        {
            System.out.print(res[n]+" ");
        }

    }
}
