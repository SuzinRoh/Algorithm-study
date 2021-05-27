import java.io.*;
import java.util.StringTokenizer;
public class Beakjoon11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine().trim());
		
		for(int i=1; i <= t; i++) {
			st = new  StringTokenizer(br.readLine().trim()," ");
			sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken()) 
					+ Integer.parseInt(st.nextToken())).append("\n");
		}
		System.out.print(sb);
	}

}
