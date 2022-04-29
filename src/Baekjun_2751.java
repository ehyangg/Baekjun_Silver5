import java.io.*;
import java.util.*;

public class Baekjun_2751 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			hashSet.add(Integer.parseInt(br.readLine()));
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
		Collections.sort(arrayList);

		for (int value : arrayList) {
			sb.append(value).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
