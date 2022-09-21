package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		int[] nums = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length - 3; i++) {
//			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				for (int j = i + 1; j < nums.length - 2; j++) {
//					if (j == i + 1 || (j > i + 1 && nums[j] != nums[j - 1])) {
						int k = j + 1;
						int l = nums.length - 1;
						while (k < l) {
							int sum = 0;
							sum = nums[i] + nums[j] + nums[k] + nums[l];
							System.out.println(sum);
							if (sum == target) {
								list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
								while (k < l && nums[l] == nums[l - 1]) {
									l--;
								}
								while (k < l && nums[k] == nums[k + 1]) {
									k++;
								}
								l--;
								k++;
							} else if (sum < target) {
								k++;
							} else {
								l--;
							}
//						}
//					}
				}
			}
		}
		System.out.println(list);
	}
}
