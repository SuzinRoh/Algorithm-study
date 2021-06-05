import java.util.*;
import java.io.*;
public class Beakjoon10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine().trim()," ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine().trim()," ");
		br.close();
		
		int tmp = 0;
		for(int i=0; i<n; i++) {
			tmp = Integer.parseInt(st.nextToken());
			if(tmp < x) sb.append(tmp).append(" ");
		}
		
		System.out.println(sb);
	}
}
/*
 코드 v0.1
 BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine().trim()," ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine().trim()," ");
		br.close();
		int[] tmp = new int[n];
		for(int i=0; i<n; i++) {
			tmp[i] = Integer.parseInt(st.nextToken());
		}
		for(int str: tmp) {
			if(str < x) {
				System.out.print(str+" ");
			}
			
		}
		
		bw.flush();
		bw.close();
 */