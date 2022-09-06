package Practice;

public class DuplicateBinary {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if ((arr[i] ^ arr[i + 1]) != 0) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
