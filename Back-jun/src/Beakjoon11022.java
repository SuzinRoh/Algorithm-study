import java.io.*;
import java.util.*;
public class Beakjoon11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine().trim());
		StringTokenizer st;

		for(int i = 1; i<= t; i++) {
			st = new StringTokenizer(br.readLine().trim()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append("Case").append(" ").append("#").append(i)
				.append(": ").append(a).append(" + ").append(b)
				.append(" = ").append(a+b).append("\n");
		}
		System.out.println(sb);
	}
}
	
