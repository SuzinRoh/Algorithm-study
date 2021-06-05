import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjun10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a =0;
		while(true) {
			st = new StringTokenizer(br.readLine().trim(), " ");
			
			a = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			if(a == 0 ) break;
			sb.append(a).append("\n");
		}
		System.out.println(sb);
	}
}
/*
 * v0.1

public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int a =0;
		while(true) {
			st = new StringTokenizer(br.readLine().trim(), " ");
			
			a = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			if(a == 0 ) break;
			sb.append(a).append("\n");
		}
		System.out.println(sb);
	}
 
 */