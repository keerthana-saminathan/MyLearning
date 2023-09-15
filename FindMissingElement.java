package mytestday2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(arr);
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int restSum = 0;
		for (int i = 0; i < arr.length; i++) {
			restSum += arr[i];
		}
		int missingNumber = sum - restSum;
		System.out.println("Missing Number :" + missingNumber);

	}

}
