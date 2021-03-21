package lets.code;

import java.util.Arrays;

public class _300_LongestIncreasingSubSequence {

	public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 1;
        }
        
        int[] lis = new int[len];
        Arrays.fill(lis, 1);
        boolean incr = false;
        
        for(int i=1; i<len; i++) {
            incr = false;
            int max_in_prev = 1;
            for(int j=0; j<i; j++) {
                if(nums[j] < nums[i] && lis[j] >= max_in_prev) {
                    max_in_prev = lis[j];
                    incr = true;
                }
            }
            if (incr) {
                lis[i] = max_in_prev + 1;
            }   
        }
        
        int max = 1;
        for(int i: lis) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		_300_LongestIncreasingSubSequence t = new _300_LongestIncreasingSubSequence();
		
		System.out.println(t.lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
		
		System.out.println(t.lengthOfLIS(new int[] {0,1,0,3,2,3}));
		
		System.out.println(t.lengthOfLIS(new int[] {7,7,7,7,7,7,7}));		
	}
}