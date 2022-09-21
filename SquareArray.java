package LeetcodeProblems;

import java.util.Arrays;

public class SquareArray {
	public static void main(String[] args) {
		int nums[] = {-4,-1,0,3,10};
        int i=0;
        int[] array=new int[nums.length];
        while(i<nums.length) {
        	array[i] = nums[i]*nums[i];
        	i++;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
	}
}
