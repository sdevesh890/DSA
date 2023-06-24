package Arrays;

import java.util.HashMap;

public class pair_sum {
    public static void main(String[] args) {

        int nums[] = {1,2,3,4,5};
        int target = 5;

         HashMap<Integer,Integer> map = new HashMap<>();
        int res[] = new int[2];
        for(int i=0; i<nums.length; i++)
        {
            int diff = target-nums[i];
            if(map.containsKey(diff))
            {
               res[0] = map.get(diff);
               res[1] = i;
               break;
            }else 
            {
                map.put(nums[i],i);
            }
        }
        
        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}
