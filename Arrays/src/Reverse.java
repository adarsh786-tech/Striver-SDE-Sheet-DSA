import java.util.*;
//import java.io.*;

public class Reverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char[] str = scan.next().toCharArray();
		int low = 0;
		int high = str.length-1;
		while(low <= high) {
			char temp = str[low];
			str[low] = str[high];
			str[high] = temp;
			low++;
			high--;
		}
		
		System.out.println(str);
		scan.close();

	}

}
