package LeetcodeProblems;

public class WaterContainer {
	public static void main(String[] args) {
		int a[] = {1,8,6,2,5,4,8,3,7};
		int maxArea = 0;
		int left = 0;
		int right = a.length-1;
		int count =0;
		while(left<right) {
			count++;
			maxArea = Math.max(maxArea, Math.min(a[left], a[right]) * (right - left));
			if(a[left] <= a[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		System.out.println(maxArea);
		System.out.println(count);
	}
}
