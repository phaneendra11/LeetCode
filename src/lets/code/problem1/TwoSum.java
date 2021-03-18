/**
 * 
 * Given an array of integers nums and an integer target, return indices of the 
 * two numbers such that they add up to target. You may assume that each input 
 * would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Constraints:
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 * 
 * */

package lets.code.problem1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] response = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(nums[0], 0);
        
        for(int i=1; i<length; i++) {
            if(map.containsKey(target - nums[i])) {
                response[0] = map.get(target - nums[i]);
                response[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return response;
    }
	
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		
		int[] response = t.twoSum(new int[] {2,7,11,15}, 9);
		System.out.println(Arrays.toString(response));
		
		response = t.twoSum(new int[] {3,2,4}, 6);
		System.out.println(Arrays.toString(response));
		
		response = t.twoSum(new int[] {3,3}, 6);
		System.out.println(Arrays.toString(response));
	}

}
