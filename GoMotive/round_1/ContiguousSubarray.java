package GoMotive.round_1;

import java.util.HashMap;

public class ContiguousSubarray {

//    https://leetcode.com/problems/contiguous-array/
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum=0;
        int max_len=0;

        for(int i =0; i<n;i ++){

            sum += nums[i]==0? -1 : 1;

            if(sum ==0){
                max_len = i+1;

            }
            if(hm.containsKey(sum)){
                if(max_len < i- hm.get(sum)){
                    max_len = i- hm.get(sum);
                }
            }
            else
                hm.put(sum, i);

        }

        return max_len;
    }
}
