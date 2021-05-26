import java.io.*;
import java.util.StringTokenizer;
public class Baekjun15552 {
	public static void main(String[] args) throws IOException{
		//input output
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine().trim());
		
		StringTokenizer st ;
		for(int i=0; i < T; i++) {
			st = new StringTokenizer(br.readLine().trim()," ");
			sb.append(Integer.parseInt(st.nextToken()) + 
					Integer.parseInt(st.nextToken())).append('\n');
		}
		br.close();
		
		System.out.println(sb);
	}
		
}
/*
//input output
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine().trim());
		
		int A = 0;
		int B = 0;
		StringTokenizer st ;
		String[] result = new String[T];
		for(int i=0; i < T; i++) {
			st = new StringTokenizer(br.readLine().trim()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			result[i] = A+B+"";
		}
		
		for(String out : result) {
			bw.write(out);
			bw.newLine();//개행
		}
		bw.flush();
		bw.close();

*/