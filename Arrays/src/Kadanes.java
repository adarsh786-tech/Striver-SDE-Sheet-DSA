import java.util.*;
public class Kadanes {
	public static int maxSubarraySum(int[] nums, int n) {
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		for(int num: nums) {
			currentSum += num;
			maxSum = Math.max(maxSum, currentSum);
			if(currentSum < 0)
				currentSum = 0;
		}
		return maxSum;
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println(maxSubarraySum(nums, n));
		scan.close();
	}
}
