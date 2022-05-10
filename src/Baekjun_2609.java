import java.io.*;
import java.util.*;

public class Baekjun_2609 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int d = gcd(a,b);
		
		System.out.println(d);
		System.out.println(a*b/d);
		br.close();
	}
	
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
		}
	
	public static int lcm(int a, int b) {
		return a*b / gcd(a,b);
	}
}
