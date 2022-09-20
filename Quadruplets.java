package LeetcodeProblems;
//Submitted
public class Quadruplets {
	public static void main(String[] args) {
		int count = 0;
		int[] nums = {1,1,1,3,5};
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                	for(int l=k+1;l<nums.length;l++) {
	                    if(nums[i]+nums[j]+nums[k] == nums[l]) {
	                        count++;
	                    }
                	}
                }
            }
        }
        System.out.println(count);
	}
}
