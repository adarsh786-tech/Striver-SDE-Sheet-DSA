import java.util.*;
public class Sort012 {
//	public static void swap(int x, int y) {
//		int t = x;
//		x = y;
//		y = t;
//	}
	public static void sorting012(int[] num, int n) {
		int low = 0;
		int high = n - 1;
		int mid = 0;
		while(mid <= high) {
			switch(num[mid]) {
			case 0:	int temp = num[low];
					num[low] = num[mid];
					num[mid] = temp;
					low++;
					mid++;
					break;
			case 1: mid++;
					break;
			case 2: temp = num[mid];
					num[mid] = num[high];
					num[high] = temp;
					high--;
					break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i = 0; i < n; i++)
			num[i] = scan.nextInt();
		System.out.println("Before Sorting");
		for(int nums: num)
			System.out.print(nums+" ");
		System.out.println();
		sorting012(num, n);
		System.out.println("After Sorting");
		for(int nums: num)
			System.out.print(nums+" ");
		scan.close();

	}

}
