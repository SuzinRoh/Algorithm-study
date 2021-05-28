import java.io.*;
public class Beakjoon2439 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++){
				sb.append(" ");
			}
			for(int k=1; k<=i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
/*
 BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		br.close();

		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++){
				sb.append(" ");
			}
			a +="*";
			sb.append(a);
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	
	BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		br.close();
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++){
				sb.append(" ");
			}
			for(int k=1; k<=i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
 */