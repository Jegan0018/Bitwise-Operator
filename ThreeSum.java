package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
    	int[] a= {-1,0,1,2,-1,-4};
    	Arrays.sort(a);
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<a.length-1;i++) {
			int j=i+1;
			int k=a.length-1;
			while(j<k) {
				int sum = a[i] + a[j] +a[k];
				if(sum == 0) {
					list.add(Arrays.asList(a[i],a[j],a[k]));
					while(j<k && a[j] == a[j+1]) {
						j++;
					}
					while(i<k && a[i] == a[i+1]) {
						i++;
					}
					k--;
					j++;
				}
				else if (sum>0) {
					k--;
				}
				else {
					j++;
				}
			}
		}
		System.out.println(list);
	}
}
