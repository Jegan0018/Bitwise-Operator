package LeetcodeProblems;

import java.util.Arrays;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;) {
            if(i+2>nums.length) {
                return nums[i];
            }
            if(nums[i] == nums[i+2]) {
                i=i+2;
            }
            else {
                return nums[i];
            }
        }
        return nums[0];
    }
}
