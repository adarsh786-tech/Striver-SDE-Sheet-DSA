import java.util.*;
public class Duplicates {
	public static void findDuplicates(int[] nums, int n) {
		int c = 1;
		for(int i = 0; i < n; i++) {
			int index = nums[i] % n;
			nums[index] += n;
			if(nums[index]/n == 2) {
				System.out.print(index + " ");
				c = 0;
			}
		}
		if(c == 1)
			System.out.print(-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		for(int i = 0; i < n; i++)
			nums[i] = scan.nextInt();
		findDuplicates(nums, n);
		scan.close();
	}

}
