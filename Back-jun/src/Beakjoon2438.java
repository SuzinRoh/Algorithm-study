import java.io.*;
import java.util.*;
public class Beakjoon2438 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		br.close();
		String a = "";
		for(int i=1; i<=n; i++) {
			a +="*";
			sb.append(a).append("\n");
		}
		System.out.print(sb);
	}
}
/*
BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
 */