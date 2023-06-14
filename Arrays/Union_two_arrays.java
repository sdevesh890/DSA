package Arrays;

import java.util.HashSet;

public class Union_two_arrays {
   
    public static void main(String[] args) {
        int a[] = {1,5,4,3,2,1,2};
        int b[] = {5,2,3,7,1,1};

         HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<a.length; i++)
        set.add(a[i]);
        for(int i=0; i<b.length; i++)
        set.add(b[i]);

        int c[] = new int[set.size()];

        int i=0;

        for(int n:set)
        {
            c[i++] = n;
        }

        for(int j=0; j<c.length; j++)
        System.out.print(c[j]+" ");
    }
}
