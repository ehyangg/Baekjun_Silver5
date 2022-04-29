import java.util.Scanner;
import java.util.Arrays;

public class Baekjun_2751 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			if(arr[i]==arr[i+1]) {
				arr[i+1] = arr[i];
			}
			System.out.println(arr[i]);
		}
	}
}
