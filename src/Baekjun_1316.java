import java.util.*;

public class Baekjun_1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] arr = new String[100];
		for(int i=0; i<a; i++) {
			String s = sc.next(); 
			arr[i] = s;
			Arrays.sort(arr);
		}
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				
				char[] b = new char[100];
				b[i] = arr[i].charAt(j);
				if(arr[i].charAt(j)) {
				
				}				
			}
		}
	}
}
